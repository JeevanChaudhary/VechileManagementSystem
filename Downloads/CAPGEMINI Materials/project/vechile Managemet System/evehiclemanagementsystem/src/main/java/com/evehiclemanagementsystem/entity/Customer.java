package com.evehiclemanagementsystem.entity;



import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="customer_tbl")
public class Customer {
	@Id

	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="customer_id")
	private int customerId;
	
	@Column(name="customer_name")
	private String customerName;
	
	@Column(name="customer_phone")
	private long customerPhone;
	
	@Column(name="customer_email")
	private String customerEmail;
	
	@Column(name="customer_address")
	private String customerAddress;
	
	@Column(name="customer_userName")
	private String customerUserName;
	
	@Column(name="customer_password")
	private String customerPassword;
	
	@OneToMany(mappedBy = "customer")
	private Set<ServiceRequest> serviceRequest=new HashSet<>();
	
	

	public Set<ServiceRequest> getServiceRequest() {
		return serviceRequest;
	}

	public void setServiceRequest(Set<ServiceRequest> serviceRequest) {
		this.serviceRequest = serviceRequest;
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public long getCustomerPhone() {
		return customerPhone;
	} 

	public void setCustomerPhone(long customerPhone) {
		this.customerPhone = customerPhone;
	}

	public String getCustomerEmail() {
		return customerEmail;
	}

	public void setCustomerEmail(String customerEmail) {
		this.customerEmail = customerEmail;
	}

	public String getCustomerAddress() {
		return customerAddress;
	}

	public void setCustomerAddress(String customerAddress) {
		this.customerAddress = customerAddress;
	}

	public String getCustomerUserName() {
		return customerUserName;
	}

	public void setCustomerUserName(String customerUserName) {
		this.customerUserName = customerUserName;
	}

	public String getCustomerPassword() {
		return customerPassword;
	}

	public void setCustomerPassword(String customerPassword) {
		this.customerPassword = customerPassword;
	}

}