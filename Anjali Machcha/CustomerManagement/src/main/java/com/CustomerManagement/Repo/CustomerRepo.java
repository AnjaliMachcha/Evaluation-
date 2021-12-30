package com.CustomerManagement.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.CustomerManagement.entity.Customer;

public interface CustomerRepo extends JpaRepository<Customer, Integer> {

}
