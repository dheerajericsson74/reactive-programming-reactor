package com.star.service;

import static org.junit.jupiter.api.Assertions.*;

import java.awt.List;

import org.junit.jupiter.api.Test;

import com.star.service.FluxAndMonoGeneratorService;

import reactor.test.StepVerifier;

class FluxAndMonoTest {
	
	
	FluxAndMonoGeneratorService svc = new FluxAndMonoGeneratorService();

	//@Test
	void testNamesFlux() {
		var namesFlux =	svc.namesFlux();
		
		StepVerifier.create(namesFlux)
		            .expectNextCount(12)
//		            .expectNext("kaliya", "sambha", "gabber", "ramlal", "rahim chaha", "jay", "veru", "thakur",
//					"shaniya", "ramlal", "Thanno", "Mausi")
		            .verifyComplete();
		
			
	
	}

	//@Test
	void testNamesFlux_map() {
		var namesFlux =	svc.namesFlux_map();
		StepVerifier.create(namesFlux)
        .expectNextCount(12)
        .expectNext("kaliya", "sambha", "gabber", "ramlal", "rahim chaha", "jay", "veru", "thakur",
		"shaniya", "ramlal", "Thanno", "Mausi")
        .verifyComplete();
	}

	//@Test
	void testNameMono() {
		fail("Not yet implemented");
	}
	
	//@Test
	void testNameMono_flatMap() {
		
		var namesFlux =	svc.nameMono_flatMap(4);
		StepVerifier.create(namesFlux)
		            .expectNext(java.util.List.of("G","A","B","B","E","R"))
		            .verifyComplete();
	}


	//@Test
	void testNameMono_flatMapMany() {
		var namesFlux =	svc.nameMono_flatMapMany(4);
		
	}
	
}
