package com.manipal.model;



import java.util.Date;

import com.manipal.model.Address;

public class Customer
{
	private String customer_Id;
	
	private String customer_Username;
	private String customer_Password;
	private String customer_First_Name;
	private String customer_Last_Name;
	private String customer_Gender;
	private String customer_DOB;
	private String customer_Contact;
	private String customer_Email;
	//private Address customer_Address_Id;
	private String customer_Address_Id;
	private String customer_Register_Date;
	private String customer_Status;
	
	public Customer() 
	{
		super();
	}
	//for retrive for editcustomer.jsp
	public Customer(
			String customer_Id,
			String customer_username,
			String customer_First_Name,
			String customer_Last_Name,
			String customer_Gender,
			String customer_DOB,
			String customer_Contact,
			String customer_Email,
			String customer_Register_Date,
			String customer_Status) {
		super();
		this.customer_Id = customer_Id;
		this.customer_Username=customer_username;
		this.customer_First_Name = customer_First_Name;
		this.customer_Last_Name = customer_Last_Name;
		this.customer_Gender = customer_Gender;
		this.customer_DOB = customer_DOB;
		this.customer_Contact = customer_Contact;
		this.customer_Email = customer_Email;
		this.customer_Register_Date = customer_Register_Date;
		this.customer_Status = customer_Status;
		}
	
	//for login
	public Customer(String customer_Username, String customer_Password) {
		super();
		this.customer_Username = customer_Username;
		this.customer_Password = customer_Password;
	}


//for insert
	public Customer(String username, 
			String password,
			String frstname,
			String lastnm,
			String gender,
			String dob, 
			String ph,
			String email,
			String st) {
		super();
		this.customer_Username = username;
		this.customer_Password = password;
		this.customer_First_Name = frstname;
		this.customer_Last_Name = lastnm;
		this.customer_Gender = gender;
		this.customer_DOB = dob;
		this.customer_Contact = ph;
		this.customer_Email = email;
		this.customer_Status= st;
		//this.customer_Register_Date = customer_Register_Date;
	}

	public Customer(String customer_Id) {
		super();
		this.customer_Id = customer_Id;
	}



	public String getCustomer_Id() {
		return customer_Id;
	}

	public void setCustomer_Id(String customer_Id) {
		this.customer_Id = customer_Id;
	}

	public String getCustomer_Username() {
		return customer_Username;
	}

	public void setCustomer_Username(String customer_Username) {
		this.customer_Username = customer_Username;
	}

	public String getCustomer_Password() {
		return customer_Password;
	}

	public void setCustomer_Password(String customer_Password) {
		this.customer_Password = customer_Password;
	}

	public String getCustomer_First_Name() {
		return customer_First_Name;
	}

	public void setCustomer_First_Name(String customer_First_Name) {
		this.customer_First_Name = customer_First_Name;
	}

	public String getCustomer_Last_Name() {
		return customer_Last_Name;
	}

	public void setCustomer_Last_Name(String customer_Last_Name) {
		this.customer_Last_Name = customer_Last_Name;
	}

	public String getCustomer_Gender() {
		return customer_Gender;
	}

	public void setCustomer_Gender(String customer_Gender) {
		this.customer_Gender = customer_Gender;
	}

	public String getCustomer_DOB() {
		return customer_DOB;
	}

	public void setCustomer_DOB(String customer_DOB) {
		this.customer_DOB = customer_DOB;
	}

	public String getCustomer_Contact() {
		return customer_Contact;
	}

	public void setCustomer_Contact(String customer_Contact) {
		this.customer_Contact = customer_Contact;
	}

	public String getCustomer_Email() {
		return customer_Email;
	}

	public void setCustomer_Email(String customer_Email) {
		this.customer_Email = customer_Email;
	}

	public String getcustomer_Address_Id() {
		return customer_Address_Id;
	}

	public void setcustomer_Address_Id(String customer_Address_Id) {
		this.customer_Address_Id = customer_Address_Id;
	}

	public String getCustomer_Register_Date() {
		return customer_Register_Date;
	}

	public void setCustomer_Register_Date(String customer_Register_Date) {
		this.customer_Register_Date = customer_Register_Date;
	}

	public String getCustomer_Status() {
		return customer_Status;
	}

	public void setCustomer_Status(String customer_Status) {
		this.customer_Status = customer_Status;
	}
	
	
	
	
}
