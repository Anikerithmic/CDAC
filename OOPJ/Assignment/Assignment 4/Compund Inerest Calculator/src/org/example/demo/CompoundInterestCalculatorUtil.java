package org.example.demo;

	import java.util.Scanner;

	public class CompoundInterestCalculatorUtil {

	    private CompoundInterestCalculator calculator;

	    public void acceptRecord() {
	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter the principal amount: ₹");
	        double principal = sc.nextDouble();

	        System.out.print("Enter the annual interest rate (in percentage): ");
	        double annualInterestRate = sc.nextDouble();

	        System.out.print("Enter the number of times interest is compounded per year: ");
	        int numberOfCompounds = sc.nextInt();

	        System.out.print("Enter the investment duration (in years): ");
	        int years = sc.nextInt();

	        calculator = new CompoundInterestCalculator(principal, annualInterestRate, numberOfCompounds, years);
	    }

	    public void printRecord() {
	        if (calculator != null) {
	            System.out.println(calculator);
	            double futureValue = calculator.calculateFutureValue();
	            double totalInterest = calculator.calculateTotalInterest();

	            System.out.println("Future Value: ₹" + futureValue);
	            System.out.println("Total Interest Earned: ₹" + totalInterest);
	        } else {
	            System.out.println("No record available. Please enter the details first.");
	        }
	    }

	    public void menuList() {
	        System.out.println("\n1. Enter Investment Details");
	        System.out.println("2. Display Future Value and Interest Earned");
	        System.out.println("3. Exit");
	        System.out.print("Enter your choice: ");
	    }
	}
