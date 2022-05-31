package com.evehiclemanagementsystem.service;

import javax.management.ServiceNotFoundException;

import com.evehiclemanagementsystem.entity.ServiceRequest;

public interface VehicleServiceRequest{
	
	public ServiceRequest addServiceRequest(int serviceId,double totalAmount,String status) throws ServiceNotFoundException;
	
//	ServiceRequest addServiceRequest(ServiceRequest serviceRequest);
	

	
}
