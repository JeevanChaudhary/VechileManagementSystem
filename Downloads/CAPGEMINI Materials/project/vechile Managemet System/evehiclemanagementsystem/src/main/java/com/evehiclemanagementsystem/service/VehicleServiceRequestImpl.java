package com.evehiclemanagementsystem.service;

import java.time.LocalDateTime;
import java.util.Optional;

import javax.management.ServiceNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.evehiclemanagementsystem.entity.Customer;
import com.evehiclemanagementsystem.entity.ServiceList;
import com.evehiclemanagementsystem.entity.ServiceRequest;
import com.evehiclemanagementsystem.exception.ServiceRequestNotFoundException;
import com.evehiclemanagementsystem.repository.CustomerRepository;
import com.evehiclemanagementsystem.repository.VehicleServiceRequestRepository;


@Service
public class VehicleServiceRequestImpl implements VehicleServiceRequest {
	
	@Autowired
	private VehicleServiceRequestRepository vehicleServiceRequestRepository;

	@Override
	public ServiceRequest addServiceRequest(ServiceRequest serviceRequest) {
		ServiceRequest newServicerequest= vehicleServiceRequestRepository.save(serviceRequest);
		return newServicerequest;
	}

	@Override
	public ServiceRequest getServiceRequestById(int serviRequestId) throws ServiceRequestNotFoundException {
		Optional<ServiceRequest> serviceRequestById=vehicleServiceRequestRepository.findById(serviRequestId);
		if(serviceRequestById.isEmpty()) {
			throw new ServiceRequestNotFoundException("service request not found");
		}
		ServiceRequest serviceRequest = serviceRequestById.get();
		
		return serviceRequest;
	}	
	
	
	
	



	



	


	


	

	
	
	

}
