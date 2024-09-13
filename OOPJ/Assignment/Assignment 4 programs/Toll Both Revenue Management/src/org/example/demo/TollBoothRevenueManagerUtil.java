package org.example.demo;

import java.util.Scanner;

public class TollBoothRevenueManagerUtil {
	  private TollBoothRevenueManager tollBooth;
	    private Scanner sc = new Scanner(System.in);


	    public void menuList() {
	        System.out.println("\n1. Set Toll Rates");
	        System.out.println("2. Enter Vehicle Count");
	        System.out.println("3. Display Revenue");
	        System.out.println("4. Exit");
	        System.out.print("Enter choice: ");
	    }

	    public void acceptRecord() {
	        System.out.print("Enter toll rate for Car: ");
	        double carRate = sc.nextDouble();

	        System.out.print("Enter toll rate for Truck: ");
	        double truckRate = sc.nextDouble();

	        System.out.print("Enter toll rate for Motorcycle: ");
	        double motorcycleRate = sc.nextDouble();

	        tollBooth = new TollBoothRevenueManager(carRate, truckRate, motorcycleRate);
	    }

	    public void acceptVehicleCount() {
	        if (tollBooth == null) {
	            System.out.println("Please set toll rates first.");
	            return;
	        }

	        System.out.print("Enter number of Cars: ");
	        int carCount = sc.nextInt();
	        tollBooth.setCarCount(carCount);

	        System.out.print("Enter number of Trucks: ");
	        int truckCount = sc.nextInt();
	        tollBooth.setTruckCount(truckCount);

	        System.out.print("Enter number of Motorcycles: ");
	        int motorcycleCount = sc.nextInt();
	        tollBooth.setMotorcycleCount(motorcycleCount);
	    }

	    public void printRecord() {
	        if (tollBooth != null) {
	            System.out.println(tollBooth);
	        } else {
	            System.out.println("No records available.");
	        }
	    }

	    public void releaseResource() {
	        sc.close();
	    }
	}