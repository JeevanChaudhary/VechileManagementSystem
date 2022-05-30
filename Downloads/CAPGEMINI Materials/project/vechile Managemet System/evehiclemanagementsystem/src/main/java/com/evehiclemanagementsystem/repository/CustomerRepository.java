package com.evehiclemanagementsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.evehiclemanagementsystem.entity.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer,Integer> {
 
//public Customer updateCredential(String customerUserName,String customerPassword);
	
}
