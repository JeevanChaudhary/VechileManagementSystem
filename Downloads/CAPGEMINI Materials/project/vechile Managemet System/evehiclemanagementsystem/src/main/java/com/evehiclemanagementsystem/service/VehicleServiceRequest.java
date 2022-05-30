package com.evehiclemanagementsystem.service;

import java.util.Set;

import com.evehiclemanagementsystem.entity.ServiceList;
import com.evehiclemanagementsystem.entity.ServiceRequest;

public interface VehicleServiceRequest{
	
	ServiceRequest addServiceRequest(ServiceRequest serviceRequest);
	ServiceRequest addOrderRequest(int customerId,Set<ServiceList> serviceList );

	
}
