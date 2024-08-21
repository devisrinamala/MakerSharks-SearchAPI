package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.config.EnableSpringDataWebSupport;
import org.springframework.stereotype.Service;

import com.example.demo.models.Suppiler;
import com.example.demo.repository.suppilerrepository;
import com.example.demo.validations.suppilervalidations;



@Service

@Configuration
@EnableSpringDataWebSupport(pageSerializationMode = EnableSpringDataWebSupport.PageSerializationMode.VIA_DTO)

public class suppilerservice {

	@Autowired
	private suppilerrepository sr;
	
	public Page<Suppiler> findsuppilers(suppilervalidations validate, int page, int size) {
		
//		String location = validate.getLocation().toLowerCase().trim();
		
		Pageable pageable = PageRequest.of(page, size);
		
		return sr.findByLocationAndNatureofbusinessAndManufacturingprocess(
				
				validate.getLocation(),
				
				validate.getNatureofbusiness(),
				
				validate.getManufacturingprocess(),
				
				pageable);
	}
}
