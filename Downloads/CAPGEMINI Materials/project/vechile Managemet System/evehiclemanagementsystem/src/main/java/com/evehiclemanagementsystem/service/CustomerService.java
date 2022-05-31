package com.evehiclemanagementsystem.service;

import com.evehiclemanagementsystem.entity.Customer;

public interface CustomerService {


	public Customer saveCustomer(Customer customer);
	
	public Customer getById(int id);
	
	public String recoverPassword(int customerId);
	
	public Customer updateProfile(Customer customer);
	
	public String changePassword(int customerId,String oldPassword,String newPassword);
	
	
	
	
}
