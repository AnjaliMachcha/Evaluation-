package com.CarManagement.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;

@Entity
public class Car {
	private Long carNo;
	private String carOwner;
	private String fuelType;
	private String model;
	
	List<Trip> trip=new ArrayList<>();

	public Car(Long carNo, String carOwner, String fuelType, String model, List<Trip> trip) {
		super();
		this.carNo = carNo;
		this.carOwner = carOwner;
		this.fuelType = fuelType;
		this.model = model;
		this.trip = trip;
	}

	public Car(Long carNo, String carOwner, String fuelType, String model) {
		super();
		this.carNo = carNo;
		this.carOwner = carOwner;
		this.fuelType = fuelType;
		this.model = model;
	}

	public Car() {
		super();
	}

	public Long getCarNo() {
		return carNo;
	}

	public void setCarNo(Long carNo) {
		this.carNo = carNo;
	}

	public String getCarOwner() {
		return carOwner;
	}

	public void setCarOwner(String carOwner) {
		this.carOwner = carOwner;
	}

	public String getFuelType() {
		return fuelType;
	}

	public void setFuelType(String fuelType) {
		this.fuelType = fuelType;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public List<Trip> getTrip() {
		return trip;
	}

	public void setTrip(List<Trip> trip) {
		this.trip = trip;
	}

	@Override
	public String toString() {
		return "Car [carNo=" + carNo + ", carOwner=" + carOwner + ", fuelType=" + fuelType + ", model=" + model
				+ ", trip=" + trip + "]";
	}
	
	

}
