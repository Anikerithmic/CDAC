package org.example.A1;

import java.util.Scanner;

public class LoanAmortizationCalculatorUtil {
	private Scanner scanner = new Scanner(System.in);
    private LoanAmortizationCalculator loanCalculator;
    
    public void acceptRecord() {
        System.out.print("Enter loan amount: ");
        double principal = scanner.nextDouble();
        System.out.print("Enter annual interest rate: ");
        double annualInterestRate = scanner.nextDouble();
        System.out.print("Enter loan term : ");
        int loanTerm = scanner.nextInt();

        loanCalculator = new LoanAmortizationCalculator(principal, annualInterestRate, loanTerm);
    }

    public void printRecord() {
        if (loanCalculator != null) {
            System.out.println(loanCalculator);
            double monthlyPayment = loanCalculator.calculateMonthlyPayment();
            double totalPayment = loanCalculator.calculateTotalPayment();
            System.out.printf("Monthly Payment: %.2f\n", monthlyPayment);
            System.out.printf("Total Payment: %.2f\n", totalPayment);
        } else {
            System.out.println("No loan details available. Please enter loan details first.");
        }
    }

	public void menuList() {
		System.out.println("1. Enter Loan Details");
        System.out.println("2. Show Loan Details");
        System.out.println("3. Exit");
        System.out.print("Enter choice: ");
		
	}
}
