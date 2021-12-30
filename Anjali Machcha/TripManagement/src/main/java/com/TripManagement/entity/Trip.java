package com.TripManagement.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Trip {
	@Id
	private Long tripId;
	private Long carNo;
	private String customerName;
	private String source;
	private Long amount;
	
	
	public Trip(Long tripId, Long carNo, String customerName, String source, Long amount) {
		super();
		this.tripId = tripId;
		this.carNo = carNo;
		this.customerName = customerName;
		this.source = source;
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


	public String getCustomerName() {
		return customerName;
	}


	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}


	public String getSource() {
		return source;
	}


	public void setSource(String source) {
		this.source = source;
	}


	public Long getAmount() {
		return amount;
	}


	public void setAmount(Long amount) {
		this.amount = amount;
	}
	
	
	
	
	

}
