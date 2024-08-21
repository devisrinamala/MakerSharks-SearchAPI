package com.example.demo.validations;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor

public class suppilervalidations {

	@NotBlank(message = "location is required")
	private String location;
	
	@NotBlank(message = "Nature of business is required")
	@Pattern(regexp = "small_scale|medium_scale|large_scale", message = "Invalid Nature of business")
	private String natureofbusiness;
	
	@NotBlank(message = "Manufacturing process is required")
	@Pattern(regexp = "moduling|3d_printing|casting|coating", message = "Invalid manufacturing process")
	private String manufacturingprocess;
}
