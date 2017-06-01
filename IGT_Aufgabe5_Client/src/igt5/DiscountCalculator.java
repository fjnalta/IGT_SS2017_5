package igt5;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Client Program for DiscountCalculator WSDL
 * @author ajo
 */
public class DiscountCalculator {

	public static void main(String[] args) {
		
		ArrayList<String> customers = new ArrayList<String>();
		ArrayList<String> giveRevenue = new ArrayList<String>();
		ArrayList<String> noRevenue = new ArrayList<String>();
		
		Scanner s;
		
		try {
			s = new Scanner(new File("/Users/ajo/dm.txt"));
			customers = new ArrayList<String>();
			while (s.hasNext()){
			    customers.add(s.next());
			}
			s.close();
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		for(String str : customers) {
			try {
				DiscountCalculatorStub stub = new DiscountCalculatorStub();
				DiscountCalculatorStub.GetDiscount myDiscount = new DiscountCalculatorStub.GetDiscount();
				
				myDiscount.setUsername(str);
				DiscountCalculatorStub.GetDiscountResponse myResponse = stub.getDiscount(myDiscount);
				
				if(myResponse.get_return() != 0) {
					giveRevenue.add(str);
				} else {
					noRevenue.add(str);
				}
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		for(String str : giveRevenue) {
			System.out.println("Customer with Revenue: " + str);
		}
	}

}