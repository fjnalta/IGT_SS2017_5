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
			return handler.calculateDiscount(current);
		} else {
			// no Customer found
			return 0;
		}
	}
}