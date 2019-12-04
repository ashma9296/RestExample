package com.controller.restexample;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.restexampledto.DtoforRestexample;

@RestController
@RequestMapping("/service")
public class RestExampleController {
	
	@GetMapping(value ="/provide")
	public DtoforRestexample runProgrammer() {
		DtoforRestexample dt = new DtoforRestexample();
		
		dt.setId(101);
		dt.setName("Airengine");
		dt.setCategory("infrastructure");
		System.out.println(dt.toString());
		return dt;
		
	}

}
