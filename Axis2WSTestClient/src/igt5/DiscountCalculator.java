package igt5;

import java.rmi.RemoteException;

/**
 * Client Program for DiscountCalculator WSDL
 * @author ajo
 *
 */
public class DiscountCalculator {

	public static void main(String[] args) {
		
		String username = "OG";
		
		try {
			DiscountCalculatorServiceStub stub = new DiscountCalculatorServiceStub();
			DiscountCalculatorServiceStub.GetDiscount myDiscount = new DiscountCalculatorServiceStub.GetDiscount();
			
			myDiscount.setUsername(username);
			DiscountCalculatorServiceStub.GetDiscountResponse myResponse = stub.getDiscount(myDiscount);
			
			System.out.println(myResponse);
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
