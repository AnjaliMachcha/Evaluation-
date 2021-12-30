package com.CustomerManagement.entity;

public class Customer {
	private Long cId;
	private String customerName;
	private String address;
	private String mobile;
	public Customer(Long cId, String customerName, String address, String mobile) {
		super();
		this.cId = cId;
		this.customerName = customerName;
		this.address = address;
		this.mobile = mobile;
	}
	
	
	
	public Customer() {
		super();
	}



	public Long getcId() {
		return cId;
	}
	public void setcId(Long cId) {
		this.cId = cId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	
	
	

}
