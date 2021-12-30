package com.CarManagement.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.CarManagement.Repo.CarRepo;
import com.CarManagement.entity.Car;
import com.CarManagement.service.CarService;

@RestController
@RequestMapping("/")
public class CarController {
	
	@Autowired
	CarService carservice;
	
	@RequestMapping("/car")
	public String carDetails() {
		return null;
		
	}
	
	@PostMapping("/details")
	public String details()
	{
		return null;
		
	}
	
	@RequestMapping("/details/{carNo}")
	public String DisplayAll() {
		return null;
		
	}
	
	@DeleteMapping("/delete/{carNo}")
	public String deleteCar(Car car, Long carNo)
	{
		return null;
		
	}
	

	
	

}
