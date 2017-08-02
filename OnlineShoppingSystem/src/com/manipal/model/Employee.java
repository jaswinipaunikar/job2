package com.manipal.model;

public class Employee {
	private String employee_Id;
	private String employee_Username;
	private String employee_Password;
	private String employee_First_Name;
	private String employee_Last_Name;
	private String employee_Date_Of_Birth;
	private String employee_Contact_No;
	private String employee_Email;
	private String employee_Status;
	private String employee_Address_Id;
	
	public String getEmployee_Address_Id() {
		return employee_Address_Id;
	}

	public void setEmployee_Address_Id(String employee_Address_Id) {
		this.employee_Address_Id = employee_Address_Id;
	}

	public Employee(String employee_Id, String employee_Username,
			String employee_Password, String employee_First_Name,
			String employee_Last_Name, String employee_Date_Of_Birth
			,String employee_Contact_No,String employee_Email,
			String employee_Status) {
		super();
		this.employee_Id = employee_Id;
		this.employee_Username = employee_Username;
		this.employee_Password = employee_Password;
		this.employee_First_Name = employee_First_Name;
		this.employee_Last_Name = employee_Last_Name;
		this.employee_Date_Of_Birth = employee_Date_Of_Birth;
		this.employee_Contact_No = employee_Contact_No;
		this.employee_Email = employee_Email;
		this.employee_Status = employee_Status;
	}

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	

	public Employee(String employee_Id, String employee_Username,
			String employee_Password, String employee_First_Name,
			String employee_Last_Name, String employee_Date_Of_Birth
			,String employee_Contact_No,String employee_Email,String employee_Address_Id,
			String employee_Status) {
		super();
		this.employee_Id = employee_Id;
		this.employee_Username = employee_Username;
		this.employee_Password = employee_Password;
		this.employee_First_Name = employee_First_Name;
		this.employee_Last_Name = employee_Last_Name;
		this.employee_Date_Of_Birth = employee_Date_Of_Birth;
		this.employee_Contact_No = employee_Contact_No;
		this.employee_Email = employee_Email;
		this.employee_Status = employee_Status;
		this.employee_Address_Id = employee_Address_Id;
	}
	

	public Employee(String employee_Id, String employee_Username,
			String employee_Password, String employee_First_Name,
			String employee_Last_Name, String employee_Date_Of_Birth,
			String employee_Email, String employee_Contact_No) {
		// TODO Auto-generated constructor stub
		super();
		this.employee_Id = employee_Id;
		this.employee_Username = employee_Username;
		this.employee_Password = employee_Password;
		this.employee_First_Name = employee_First_Name;
		this.employee_Last_Name = employee_Last_Name;
		this.employee_Date_Of_Birth = employee_Date_Of_Birth;
		this.employee_Contact_No = employee_Contact_No;
		this.employee_Email = employee_Email;
	
	
	}


	public Employee(String employee_Username, String employee_Password,
			String employee_First_Name, String employee_Last_Name,
			String employee_Date_Of_Birth, String employee_Email,
			String employee_Contact_No) {
		this.employee_Username = employee_Username;
		this.employee_Password = employee_Password;
		this.employee_First_Name = employee_First_Name;
		this.employee_Last_Name = employee_Last_Name;
		this.employee_Date_Of_Birth = employee_Date_Of_Birth;
		this.employee_Contact_No = employee_Contact_No;
		this.employee_Email = employee_Email;
		
	}

	public String getEmployee_Id() {
		return employee_Id;
	}
	public void setEmployee_Id(String employee_Id) {
		this.employee_Id = employee_Id;
	}
	public String getEmployee_Username() {
		return employee_Username;
	}
	public void setEmployee_Username(String employee_Username) {
		this.employee_Username = employee_Username;
	}
	public String getEmployee_Password() {
		return employee_Password;
	}
	public void setEmployee_Password(String employee_Password) {
		this.employee_Password = employee_Password;
	}
	public String getEmployee_First_Name() {
		return employee_First_Name;
	}
	public void setEmployee_First_Name(String employee_First_Name) {
		this.employee_First_Name = employee_First_Name;
	}
	public String getEmployee_Last_Name() {
		return employee_Last_Name;
	}
	public void setEmployee_Last_Name(String employee_Last_Name) {
		this.employee_Last_Name = employee_Last_Name;
	}
	public String getEmployee_Contact_No() {
		return employee_Contact_No;
	}
	public void setEmployee_Contact_No(String employee_Contact_No) {
		this.employee_Contact_No = employee_Contact_No;
	}
	public String getEmployee_Email() {
		return employee_Email;
	}
	public void setEmployee_Email(String employee_Email) {
		this.employee_Email = employee_Email;
	}
	public String getEmployee_Date_Of_Birth() {
		return employee_Date_Of_Birth;
	}
	public String getEmployee_Status() {
		return employee_Status;
	}



	public void setEmployee_Status(String employee_Status) {
		this.employee_Status = employee_Status;
	}



	public void setEmployee_Date_Of_Birth(String employee_Date_Of_Birth) {
		this.employee_Date_Of_Birth = employee_Date_Of_Birth;
	}
	/*public Address getEmployee_Address_Id() {
		return employee_Address_Id;
	}
	public void setEmployee_Address_Id(Address employee_Address_Id) {
		this.employee_Address_Id = employee_Address_Id;
	}*/
	

}
