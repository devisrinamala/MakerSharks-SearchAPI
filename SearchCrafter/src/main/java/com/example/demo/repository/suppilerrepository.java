package com.example.demo.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.models.Suppiler;

@Repository
public interface suppilerrepository extends JpaRepository<Suppiler, Long>{

	Page<Suppiler> findByLocationAndNatureofbusinessAndManufacturingprocess(
			
			String location,
			
			String nature_of_business,
			
			String manufacturing_process, 
			
			Pageable pageable);
}
