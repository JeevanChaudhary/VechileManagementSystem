package com.evehiclemanagementsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.evehiclemanagementsystem.entity.ServiceList;


@Repository
public interface ServiceListRepository extends JpaRepository<ServiceList, Integer>{
	ServiceList findByServiceName(String serviceName);
	
}
