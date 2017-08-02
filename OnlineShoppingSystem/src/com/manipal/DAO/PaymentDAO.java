package com.manipal.DAO;

public interface PaymentDAO {
	
	public String validateAccount(String cardNumber,String expiry,String cvv,double amount);
	
	

}
