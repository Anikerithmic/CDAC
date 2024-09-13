package org.example.demo;

import java.util.Scanner;

public class BMITrackerUtil {
	private BMITracker bmiTracker;
	
	public void acceptRecord() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your weight (in kg): ");
        double weight = sc.nextDouble();

        System.out.print("Enter your height (in m): ");
        double height = sc.nextDouble();
        
        bmiTracker = new BMITracker(weight, height);
	}
	
	public void printRecord() {
		if(bmiTracker != null) {
			System.out.println(bmiTracker);
			double bmi = bmiTracker.calculateBMI();
			String classify = bmiTracker.classifyBMI();
			System.out.printf("Your BMI is : %.2f%n", bmi);
			System.out.println("Your are : " + classify);
		}
		else {
			 System.out.println("No record available.");
		}
	}
		
	public void menuList() {
			System.out.println();
		 	System.out.println("1. Enter Weight and Height");
	        System.out.println("2. Display BMI and Classification");
	        System.out.println("3. Exit");
	        System.out.print("Enter your choice: ");
	}
}
