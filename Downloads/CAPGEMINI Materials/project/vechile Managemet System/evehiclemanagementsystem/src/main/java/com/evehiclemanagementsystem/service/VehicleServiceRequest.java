package com.evehiclemanagementsystem.service;

import javax.management.ServiceNotFoundException;

import com.evehiclemanagementsystem.entity.ServiceRequest;

public interface VehicleServiceRequest{
	
	ServiceRequest addServiceRequest(ServiceRequest serviceRequest);
	public ServiceRequest getServiceRequestById(int id);
	

	
}
