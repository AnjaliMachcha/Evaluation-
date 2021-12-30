package com.CarManagement.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.CarManagement.entity.Car;

public interface CarRepo extends JpaRepository<Car, Integer> {
	

}
