package com.evehiclemanagementsystem.controller;



import javax.management.ServiceNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.evehiclemanagementsystem.entity.ServiceRequest;
import com.evehiclemanagementsystem.model.RequestResponse;
import com.evehiclemanagementsystem.service.VehicleServiceRequest;


@RestController
public class VehicleServiceRequestController {
	@Autowired
	private VehicleServiceRequest vehicleServiceRequest;
	
	
	@PutMapping("/serviceRequest/response")
	public ServiceRequest sendResponse(@RequestBody RequestResponse requestResponse) throws ServiceNotFoundException {
		ServiceRequest newServiceRequest = vehicleServiceRequest.addServiceRequest(requestResponse.getServiceId(), requestResponse.getTotalAmount(), requestResponse.getStatus());
		return newServiceRequest;
		
	}
	
//	@PostMapping("/serviceRequest/save")
//	public ServiceRequest requestForService(@RequestBody ServiceRequest serviceRequest) {
//		
//		ServiceRequest newServiceRequest = vehicleServiceRequest.addServiceRequest(serviceRequest);
//		return newServiceRequest;
//		
//	}
	
	
	
	

	
	
	
	
	
}
