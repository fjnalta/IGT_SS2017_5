package igt5;

import data.Customer;
import igt5.LogicHandler;

/**
 * Network Interface Class
 * @author 
 */
public class DiscountCalculator {
	
	public int getDiscount(String username) {
		LogicHandler handler = new LogicHandler();
		// Check if Customer is available
		Customer current = handler.getCustomer(username);
		if (current != null) {
			// Calculate Discount
			int discount = handler.calculateDiscount(current);
			System.out.println(discount);
			return discount;
		} else {
			// no Customer found
			System.out.println(0);
			return 0;
		}
	}
}