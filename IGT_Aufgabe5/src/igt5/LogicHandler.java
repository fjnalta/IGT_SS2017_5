package igt5;

import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import data.Customer;

/**
 * Helper Class for Discount Network Interface
 * Splits network logic from local logic
 * @author ajo
 */
public class LogicHandler {
	
	private static SessionFactory factory;
	
	public LogicHandler() {
		try {
			factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Customer.class).buildSessionFactory();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * Loads the customer from the database
	 * @param username
	 * @returns the customer Java Object
	 */
	public Customer getCustomer(String username) {
		Transaction trans = null;
		Customer myCustomer = null;
		
		try {
			Session session = factory.openSession();
			trans = session.beginTransaction();
			
			// Setup Query and Parameter
			SQLQuery qry = session.createSQLQuery("SELECT * FROM CUSTOMER WHERE CUSTOMER.C_UNAME = :username");
			qry.addEntity(Customer.class);
			qry.setParameter("username", username);
			
			@SuppressWarnings("unchecked")
			List<Customer> customer = qry.list();
			
			// Check if Customer is available
			if(customer.isEmpty() || customer == null) {
				myCustomer = null;
			} else {
				myCustomer = customer.get(0);
			}
			
			trans.commit();
		} catch (Exception e) {
			
			e.printStackTrace();
		}

		return myCustomer;
	}
	
	/**
	 * Calculates the Discount
	 * @param username
	 * @returns the integer value of the given discount
	 */
	public int calculateDiscount(Customer customer) {
		if (has10PercentOverall(customer) | has20PercentFromPeerGroup(customer)) {
			return 10;
		} else {
			return 0;
		}
	}
	
	private boolean has10PercentOverall(Customer customer) {
		double user = getTotalUserRevenue(customer);
		double total = getTotalRevenue();
		
		System.out.println(user + "userRevenue");
		System.out.println(total + "totalRevenue");
		
		if (user / total > 0.1) {
			System.out.println("has10Percent is true");
			return true;
		} else {
			return false;
		}
	}
	
	private boolean has20PercentFromPeerGroup(Customer customer) {
		double userRevenue = getTotalUserRevenue(customer);
		double peerGroupRevenue = getTotalPeerGroupRevenue(customer);
		
		System.out.println(userRevenue + "userRevenue");
		System.out.println(peerGroupRevenue + "peerGroupRevenue");
		
		if( userRevenue / peerGroupRevenue > 0.2) {
			System.out.println("has20PercentFromPeer is true");
			return true;
		} else {
			return false;
		}
	}
	
	private double getTotalRevenue() {
		Transaction trans = null;
		double revenue = 0;
		
		try {
			Session session = factory.openSession();
			trans = session.beginTransaction();
			
			// Setup Query
			SQLQuery qry = session.createSQLQuery("SELECT SUM(CUSTOMER.C_YTD_PMT) FROM CUSTOMER");
			revenue =  (double) qry.uniqueResult();

			trans.commit();
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		return revenue;
	}
	
	private double getTotalUserRevenue(Customer customer) {
		Transaction trans = null;
		double revenue = 0;
		
		try {
			Session session = factory.openSession();
			trans = session.beginTransaction();
			
			// Setup Query
			SQLQuery qry = session.createSQLQuery("SELECT CUSTOMER.C_YTD_PMT FROM CUSTOMER WHERE CUSTOMER.C_UNAME = :username");
			qry.setParameter("username", customer.getCUname());
			revenue = (double) qry.uniqueResult();

			trans.commit();
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		return revenue;
	}
	
	private double getTotalPeerGroupRevenue(Customer customer) {
		Transaction trans = null;
		double revenue = 0;
		
		// manage date from database with calendar
		Calendar calendar = Calendar.getInstance();
		// create PeerGroup
		calendar.setTime(customer.getCBirthdate());
		calendar.add(Calendar.YEAR, -5);
		Date minDate = calendar.getTime();
		
		calendar.setTime(customer.getCBirthdate());
		calendar.add(Calendar.YEAR, 5);
		Date maxDate = calendar.getTime();
		
		try {
			Session session = factory.openSession();
			trans = session.beginTransaction();
			
			// Setup Query
			SQLQuery qry = session.createSQLQuery("SELECT SUM(CUSTOMER.C_YTD_PMT) FROM CUSTOMER WHERE C_BIRTHDATE >= :minDate AND C_BIRTHDATE <= :maxDate");
			qry.setParameter("minDate", minDate);
			qry.setParameter("maxDate", maxDate);
			revenue = (double) qry.uniqueResult();
//			System.out.println(revenue);
			
//			Long newRevenue = (new Double(revenue)).longValue();
//			revenue = newRevenue.longValue();
//			System.out.println(newRevenue);
//			System.out.println(revenue);
			

			trans.commit();
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		return revenue;
	}


}
