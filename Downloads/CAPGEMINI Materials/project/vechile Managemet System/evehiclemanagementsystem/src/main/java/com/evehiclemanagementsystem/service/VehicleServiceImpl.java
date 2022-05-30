package com.evehiclemanagementsystem.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.evehiclemanagementsystem.entity.ServiceList;
import com.evehiclemanagementsystem.repository.ServiceListRepository;

@Service
public class VehicleServiceImpl implements VehicleService {
	@Autowired
	private ServiceListRepository serviceListRepository;

	@Override
	public ServiceList getServiceListByName(String serviceName) {
		return serviceListRepository.findByServiceName(serviceName);
		 
	}

	@Override
	public List<ServiceList> getAllService() {
		List<ServiceList> serviceList= serviceListRepository.findAll();
		return serviceList;
	}
	
}
