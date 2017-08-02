package com.manipal.model;

public class Payment {
	double balance;
	String cardNumber;
	String cvv;
	public Payment(double balance, String cardNumber, String cvv) {
		super();
		this.balance = balance;
		this.cardNumber = cardNumber;
		this.cvv = cvv;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public String getCardNumber() {
		return cardNumber;
	}
	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}
	public String getCvv() {
		return cvv;
	}
	public void setCvv(String cvv) {
		this.cvv = cvv;
	}
	
	
	
}
