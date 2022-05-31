package com.evehiclemanagementsystem.service;

import java.time.LocalDateTime;
import java.util.Optional;

import javax.management.ServiceNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.evehiclemanagementsystem.entity.Customer;
import com.evehiclemanagementsystem.entity.ServiceList;
import com.evehiclemanagementsystem.entity.ServiceRequest;
import com.evehiclemanagementsystem.repository.CustomerRepository;
import com.evehiclemanagementsystem.repository.VehicleServiceRequestRepository;


@Service
public class VehicleServiceRequestImpl implements VehicleServiceRequest {
	
	@Autowired
	private VehicleServiceRequestRepository vehicleServiceRequestRepository;

	@Override
	    public ServiceRequest addServiceRequest(int serviceId, double totalAmount, String status) throws ServiceNotFoundException{
		Optional<ServiceRequest> serviceRequestById=vehicleServiceRequestRepository.findById(serviceId);
		if(serviceRequestById.isEmpty()) {
			throw new ServiceNotFoundException("Service not found.");
		}
		ServiceRequest serviceRequest=serviceRequestById.get();
		
		ServiceRequest newServiceRequest=new ServiceRequest();
		
		newServiceRequest.setBrand(serviceRequest.getBrand());
		newServiceRequest.setCategory(serviceRequest.getCategory());
		newServiceRequest.setModel(serviceRequest.getModel());
		newServiceRequest.setVehicleName(serviceRequest.getVehicleName());
		newServiceRequest.setDate(serviceRequest.getDate());
		newServiceRequest.setTotalAmount(totalAmount);
		newServiceRequest.setStatus(status);
		
		ServiceRequest newResponse= vehicleServiceRequestRepository.save(newServiceRequest);
		
		
		
		
		
		return newResponse;
	}

//	@Override
//	public ServiceRequest addServiceRequest(ServiceRequest serviceRequest) {
//		ServiceRequest newServicerequest= vehicleServiceRequestRepository.save(serviceRequest);
//		return newServicerequest;
//	}
	
	
	
	



	



	


	


	

	
	
	

}
