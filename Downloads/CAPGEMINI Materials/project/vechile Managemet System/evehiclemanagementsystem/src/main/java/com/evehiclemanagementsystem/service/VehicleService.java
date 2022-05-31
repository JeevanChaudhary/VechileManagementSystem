package com.evehiclemanagementsystem.service;

import java.util.List;

import com.evehiclemanagementsystem.entity.ServiceList;

public interface VehicleService {
	
	public ServiceList getServiceListByName(String serviceName);
	public List<ServiceList> getAllService();
	public ServiceList getById(int id);
	
}
 