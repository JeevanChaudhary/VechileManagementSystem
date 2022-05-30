package com.evehiclemanagementsystem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.evehiclemanagementsystem.entity.ServiceList;
import com.evehiclemanagementsystem.service.VehicleService;

@RestController
public class VehicleServiceController{
	@RequestMapping("/hello")
	public String sayHello() {
		String msg="hello";
		return msg;
	}
	
	@Autowired
	private VehicleService vehicleService;
	
	@GetMapping("/serviceList/all")
	public List<ServiceList> fetchAllService(){
		
		return vehicleService.getAllService();
		
	}
	
	@GetMapping("/serviceList/serviceName/{serviceName}")
	public ServiceList getServiceByName(@PathVariable("serviceName") String serviceName) {
		return vehicleService.getServiceListByName(serviceName);
	}
}