package com.evehiclemanagementsystem.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.evehiclemanagementsystem.entity.ServiceList;
import com.evehiclemanagementsystem.exception.ServiceNotFoundException;
import com.evehiclemanagementsystem.repository.ServiceListRepository;

@Service
public class VehicleServiceImpl implements VehicleService {
	@Autowired
	private ServiceListRepository serviceListRepository;

	@Override
	public ServiceList getServiceListByName(String serviceName)  throws ServiceNotFoundException{
		
		
		ServiceList newServiceName= serviceListRepository.findByServiceName(serviceName);
		if(newServiceName==null) {
			throw new ServiceNotFoundException(serviceName + " service not available.");
		}
		return newServiceName;
		 
	}

	@Override
	public List<ServiceList> getAllService() {
		List<ServiceList> serviceList= serviceListRepository.findAll();
		return serviceList;
	}

	@Override
	public ServiceList getById(int serviceId) {
		Optional<ServiceList> customerById=serviceListRepository.findById(serviceId);
		ServiceList serviceList=getById(serviceId);
		return serviceList ;
	}
	
}
