package com.evehiclemanagementsystem.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.evehiclemanagementsystem.entity.Customer;
import com.evehiclemanagementsystem.service.CustomerService;

@RestController
public class CustomerController {

	@Autowired
	private CustomerService customerService;

	@PostMapping("/customer/save")
	public Customer addCustomer(@RequestBody Customer customer) {

		Customer newCustomer = customerService.saveCustomer(customer);
		return newCustomer;
	}

	@GetMapping("/customer/find/{customerId}")
	public Customer fetchCustomerById(@PathVariable("customerId") int customerId) {
		Customer customer = customerService.getById(customerId);
		return customer;
	}
	
	@GetMapping("/customer/recoverPassword/{customerId}")
	public String recoverPassword(@PathVariable int customerId) {
		String customerPassword=customerService.recoverPassword(customerId);
		return customerPassword;
	}
	@PostMapping("/customer/update")
	public Customer updatedProfile(@RequestBody Customer customer) {
		Customer updatedProfile=customerService.updateProfile(customer);
		
		return updatedProfile;
	}

}
