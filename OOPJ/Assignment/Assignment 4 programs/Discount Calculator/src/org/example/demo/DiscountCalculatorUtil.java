package org.example.demo;

import java.util.Scanner;

public class DiscountCalculatorUtil {
	private DiscountCalculator discountCalculator;
	private Scanner sc  = new Scanner(System.in);
	
	public void menuList() {
		System.out.println("1.Accept record");
		System.out.println("2. Print record");
		System.out.println("3. Exit");
		System.out.println(" Enter choice: ");
		
	}
	
	public void acceptRecord() {
			System.out.print("Enter original price: ");
	        double originalPrice = sc.nextDouble();

	        System.out.print("Enter discount rate (%): ");
	        double discountRate = sc.nextDouble();
	        
	        discountCalculator = new DiscountCalculator(originalPrice, discountRate);
	        
	}
	
	public void printRecord() {
		if(discountCalculator != null) {
			  System.out.println(discountCalculator);
        } else {
            System.out.println("No record available.");
        }
	}
	
	 public void releaseResource() {
	        sc.close();
	    }
}
