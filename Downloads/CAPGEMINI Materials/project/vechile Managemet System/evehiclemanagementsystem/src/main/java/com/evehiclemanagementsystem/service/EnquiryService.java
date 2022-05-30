package com.evehiclemanagementsystem.service;

import com.evehiclemanagementsystem.entity.Enquiry;

public interface EnquiryService {
	
    public Enquiry saveEnquiry(Enquiry enquiry);
    
    public Enquiry getById(int id);

	
}
