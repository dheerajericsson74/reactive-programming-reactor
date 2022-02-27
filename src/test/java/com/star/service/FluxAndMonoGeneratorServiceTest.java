package com.star.service;

import org.junit.jupiter.api.Test;

import com.star.service.FluxAndMonoGeneratorService;

import reactor.test.StepVerifier;

public class FluxAndMonoGeneratorServiceTest {
	
	
	
	FluxAndMonoGeneratorService svc = new FluxAndMonoGeneratorService();
	
	
	
	
	@Test
	void nameFlux() {
		
	var namesFlux =	svc.namesFlux();
	
	StepVerifier.create(namesFlux)
	            .expectNextCount(12)
//	            .expectNext("kaliya", "sambha", "gabber", "ramlal", "rahim chaha", "jay", "veru", "thakur",
//				"shaniya", "ramlal", "Thanno", "Mausi")
	            .verifyComplete();
	
		
	}
	
	
	
	
	
}
