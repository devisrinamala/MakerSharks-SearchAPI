package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.web.PagedResourcesAssembler;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.PagedModel;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.models.Suppiler;
import com.example.demo.service.suppilerservice;
import com.example.demo.validations.suppilervalidations;

@RestController
@RequestMapping("/api/suppiler")

public class suppilercontroller {

	@Autowired
	private suppilerservice ss;
	
	@Autowired
	private PagedResourcesAssembler<Suppiler> pra;
	
	@PostMapping("/query")
	public PagedModel<EntityModel<Suppiler>> querysuppilers(@RequestBody suppilervalidations validate,@RequestParam(defaultValue = "0") int page,@RequestParam(defaultValue = "10") int size) {
		
		Page<Suppiler> s = ss.findsuppilers(validate, page, size);
		
		return pra.toModel(s);
	}
	
}
