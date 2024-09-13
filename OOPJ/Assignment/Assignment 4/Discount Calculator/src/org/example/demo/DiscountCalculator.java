package org.example.demo;

public class DiscountCalculator {
	
	private double originalPrice;
	private double discountRate;
	
	public DiscountCalculator(double originalPrice, double discountRate) {
		this.originalPrice = originalPrice;
		this.discountRate = discountRate;
	}
	
	public double getOriginalPrice() {
		return originalPrice;
	}
	public void setOriginalPrice(double originalPrice) {
		this.originalPrice = originalPrice;
	}
	public double getDiscountRate() {
		return discountRate;
	}
	public void setDiscountRate(double discountRate) {
		this.discountRate = discountRate;
	}
	
	public double calculateDiscountAmount() {
		return originalPrice * (discountRate / 100);
	}
	public double calculateFinalPrice() {
		return originalPrice - calculateDiscountAmount();
	}
	
	@Override
	public String toString() {
		return "\nOrginal price : " + originalPrice + 
				"\nDiscount rate : " + discountRate + "%" +
				"\nDiscount amount: " + String.format("%.2f", calculateDiscountAmount()) +
				"\nFinal price : " + calculateFinalPrice();
	}
	
}