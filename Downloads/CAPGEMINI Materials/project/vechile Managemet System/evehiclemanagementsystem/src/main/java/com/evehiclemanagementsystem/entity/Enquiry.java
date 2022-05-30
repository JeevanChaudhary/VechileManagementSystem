package com.evehiclemanagementsystem.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="enquiry_tbl")
public class Enquiry {
    
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="enquiry_id")
	private int enquiryId;
	
	@Column(name="query")
	private String query;
	
	@Column(name="response")
	private String response;
	
	@Column(name="status")
	private String status;
	
	
	@ManyToOne
	@JoinColumn(name="customer_id")
	private Customer customer;
	
	public int getEnquiryId() {
		return enquiryId;
	}



	public void setEnquiryId(int enquiryId) {
		this.enquiryId = enquiryId;
	}



	public String getQuery() {
		return query;
	}



	public void setQuery(String query) {
		this.query = query;
	}



	public String getResponse() {
		return response;
	}



	public void setResponse(String response) {
		this.response = response;
	}



	public String getStatus() {
		return status;
	}



	public void setStatus(String status) {
		this.status = status;
	}



	public Customer getCustomer() {
		return customer;
	}



	public void setCustomer(Customer customer) {
		this.customer = customer;
	}



	
}
