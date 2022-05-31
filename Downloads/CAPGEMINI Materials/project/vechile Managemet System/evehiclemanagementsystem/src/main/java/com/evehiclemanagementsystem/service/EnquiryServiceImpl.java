package com.evehiclemanagementsystem.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.evehiclemanagementsystem.entity.Enquiry;
import com.evehiclemanagementsystem.exception.EnquiryNotFoundException;
import com.evehiclemanagementsystem.repository.EnquiryRepository;


@Service
public class EnquiryServiceImpl implements EnquiryService {
	
	@Autowired
	private EnquiryRepository enquiryRepository;

	@Override
	public Enquiry saveEnquiry(Enquiry enquiry) {
		Enquiry newEnquiry = enquiryRepository.save(enquiry);
		return newEnquiry;
	}
	
	@Override
	public Enquiry getById(int enquiryId) throws EnquiryNotFoundException {
		
		Optional<Enquiry> optionalEnquiry = enquiryRepository.findById(enquiryId);	
		
		if(optionalEnquiry.isEmpty()) {
			
			throw new EnquiryNotFoundException("Enquiry Not found with id: "+enquiryId);
		}
		
		Enquiry enquiry = optionalEnquiry.get();
		return enquiry;
	}

	

}
