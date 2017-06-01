package igt5;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Client Program for DiscountCalculator WSDL
 * @author ajo
 */
public class DiscountCalculator {

	public static void main(String[] args) {
		
		while(true) {
			try {
				BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				System.out.print("Please insert the Username: ");
				String username = br.readLine();
				
				DiscountCalculatorStub stub = new DiscountCalculatorStub();
				DiscountCalculatorStub.GetDiscount myDiscount = new DiscountCalculatorStub.GetDiscount();
				
				myDiscount.setUsername(username);
				DiscountCalculatorStub.GetDiscountResponse myResponse = stub.getDiscount(myDiscount);
				
				System.out.println(myResponse.get_return());
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}