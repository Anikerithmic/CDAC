package org.example.demo;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		 DiscountCalculatorUtil util = new DiscountCalculatorUtil();
	     Scanner sc = new Scanner(System.in);
	     
	     while (true) {
	            util.menuList();
	            int choice = sc.nextInt();
	            switch (choice) {
	                case 1:
	                    util.acceptRecord();
	                    break;
	                case 2:
	                    util.printRecord();
	                    break;
	                case 3:
	                    System.out.println("Exiting.");
	                    util.releaseResource();
	                    System.exit(0);
	                default:
	                    System.out.println("Invalid choice.");
	            }
	        }
	    }
	}