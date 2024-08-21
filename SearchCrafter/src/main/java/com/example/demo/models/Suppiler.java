package com.example.demo.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor

@Entity
public class Suppiler {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long suppiler_id;
	
	private String company_name;
	
	private String website;
	
	private String location;
	
	private String natureofbusiness;
	
	private String manufacturingprocess;
}
