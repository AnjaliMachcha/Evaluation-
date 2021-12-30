package com.CarManagement.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Trip {
	@Id
	private Long tripId;
	private Long carNo;
	private String source;
	private String customerName;
	private Long amount;
	
	public Trip(Long tripId, Long carNo, String source, String customerName, Long amount) {
		super();
		this.tripId = tripId;
		this.carNo = carNo;
		this.source = source;
		this.customerName = customerName;
		this.amount = amount;
	}
	
	public Trip() {
		super();
	}
	
	
	public Long getTripId() {
		return tripId;
	}
	public void setTripId(Long tripId) {
		this.tripId = tripId;
	}
	public Long getCarNo() {
		return carNo;
	}
	public void setCarNo(Long carNo) {
		this.carNo = carNo;
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public Long getAmount() {
		return amount;
	}
	public void setAmount(Long amount) {
		this.amount = amount;
	}
	
	
	

}
