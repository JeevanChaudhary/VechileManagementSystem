package com.evehiclemanagementsystem.service;

import java.time.LocalDateTime;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.evehiclemanagementsystem.entity.Customer;
import com.evehiclemanagementsystem.entity.ServiceList;
import com.evehiclemanagementsystem.entity.ServiceRequest;
import com.evehiclemanagementsystem.repository.VehicleServiceRequestRepository;


@Service
public class VehicleServiceRequestImpl implements VehicleServiceRequest {
	
	@Autowired
	private VehicleServiceRequestRepository vehicleServiceRequestRepository;
	
	@Autowired
	private CustomerService customerService;
	
	
	@Override
	public ServiceRequest addServiceRequest(ServiceRequest serviceRequest) {
		ServiceRequest newServicerequest= vehicleServiceRequestRepository.save(serviceRequest);
		return newServicerequest;
	}

	@Override
	public ServiceRequest addOrderRequest(int customerId, Set<ServiceList> serviceList) {
		ServiceRequest serviceRequest=new ServiceRequest();
		serviceRequest.setDate(LocalDateTime.now());
		serviceRequest.setStatus("Pending");
		
		Customer customer=customerService.getById(customerId);
		serviceRequest.setCustomer(customer);
	
		serviceList.forEach(item->{
			int serviceRequestId=item.getServiceId();
			double totalAmount=item.getPrice();
			item.setPrice(totalAmount);
			
		});
		
		ServiceRequest newserviceRequest=vehicleServiceRequestRepository.save(serviceRequest);
		
		return newserviceRequest;
	}

	
	

}
