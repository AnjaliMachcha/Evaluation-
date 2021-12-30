package com.TripManagement.entity;


public class Car {
	private Long carNo;
	private String carOwner;
	private String fuelType;
	private String model;
	
	

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

	
	
	@Override
	public String toString() {
		return "Car [carNo=" + carNo + ", carOwner=" + carOwner + ", fuelType=" + fuelType + ", model=" + model
				+ "]";
	}
	
	

}