package com.manipal.model;

public class Supplier {

	private String supplier_Id;
	private String supplier_Name;
	
	private String supplier_Username;
	private String supplier_Password;
	private String supplier_Contact;
	private String supplier_Email;
	private String supplier_Address_Id;
	private String status;
	
	/*
	public Supplier(String supplier_Id2, String supplier_Name2, String supplier_Username2, String supplier_Password2, String supplier_Contact2, String supplier_Email2, String supplier_Address_Id2, String supplier_status) {
		//super();
		this.supplier_Id = supplier_Id2;
		this.supplier_Name = supplier_Name2;
		this.supplier_Username = supplier_Username2;
		this.supplier_Password = supplier_Password2;
		this.supplier_Contact = supplier_Contact2;
		this.supplier_Email = supplier_Email2;
		this.supplier_Address_Id=supplier_Address_Id2;
		this.status=supplier_status;
		
	}*/
	public Supplier(String status) {
		super();
		this.status = status;
	}

	public String getStatus() {
		return status;
	}

	public String getSupplier_Address_Id() {
		return supplier_Address_Id;
	}

	public void setSupplier_Address_Id(String supplier_Address_Id) {
		this.supplier_Address_Id = supplier_Address_Id;
	}
	private Address supplier_Address;
	
	
	
	public Supplier(String supplier_Id, String supplier_Name,
			String supplier_Username, String supplier_Password,
			String supplier_Contact, String supplier_Email	)
	{
		super();
		this.supplier_Id = supplier_Id;
		this.supplier_Name = supplier_Name;
		this.supplier_Username = supplier_Username;
		this.supplier_Password = supplier_Password;
		this.supplier_Contact = supplier_Contact;
		this.supplier_Email = supplier_Email;
		}

	    public Supplier(String supplier_Id, String supplier_Name,
			String supplier_Username, String supplier_Password,
			String supplier_Contact, String supplier_Email,
			String supplier_Address_Id) {
		this.supplier_Id = supplier_Id;
		this.supplier_Name = supplier_Name;
		this.supplier_Username = supplier_Username;
		this.supplier_Password = supplier_Password;
		this.supplier_Contact = supplier_Contact;
		this.supplier_Email = supplier_Email;
		this.supplier_Address_Id=supplier_Address_Id;}

	public Supplier(String supplier_Name2, String supplier_Username2,
			String supplier_Password2, String supplier_Contact2,
			String supplier_Email2) {
		this.supplier_Name = supplier_Name2;
		this.supplier_Username = supplier_Username2;
		this.supplier_Password = supplier_Password2;
		this.supplier_Contact = supplier_Contact2;
		this.supplier_Email = supplier_Email2;
	}

	public Address getSupplier_Address() {
		return supplier_Address;
	}
	public void setSupplier_Address(Address supplier_Address) {
		this.supplier_Address = supplier_Address;
	}

	public String getSupplier_Id() {
		return supplier_Id;
	}
	public String getSupplier_Name() {
		return supplier_Name;
	}
	public String getSupplier_Username() {
		return supplier_Username;
	}
	public String getSupplier_Password() {
		return supplier_Password;
	}
	public String getSupplier_Contact() {
		return supplier_Contact;
	}
	public String getSupplier_Email() {
		return supplier_Email;
	}
	
	
	
	
	
	
	
}
