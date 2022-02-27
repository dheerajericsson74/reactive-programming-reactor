/**
 * 
 */
package com.star.service;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Test;

import reactor.test.StepVerifier;

/**
 * @author dheeraj
 *
 */
class FluxAndMonoGeneratorServiceTestTest {

	
	FluxAndMonoGeneratorService svc = new FluxAndMonoGeneratorService();

	
	/**
	 * Test method for {@link com.star.service.FluxAndMonoGeneratorService#namesFlux()}.
	 */
	//@Test
	void testNamesFlux() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link com.star.service.FluxAndMonoGeneratorService#namesFlux_map()}.
	 */
	@Test
	void testNamesFlux_map() {
		var namesFlux = svc.namesFlux_map();
		
		
		StepVerifier.create(namesFlux)
		             .expectNext("kaliya".toUpperCase(), "sambha".toUpperCase(), "gabber".toUpperCase(), "ramlal".toUpperCase(), "rahim chaha".toUpperCase(), "jay".toUpperCase(), "veru".toUpperCase(), "thakur".toUpperCase(),"shaniya".toUpperCase(), "ramlal".toUpperCase(), "Thanno".toUpperCase(), "Mausi".toUpperCase())
		             .verifyComplete();

	}

	/**
	 * Test method for {@link com.star.service.FluxAndMonoGeneratorService#nameMono()}.
	 */
	//@Test
	void testNameMono() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link com.star.service.FluxAndMonoGeneratorService#nameMono_flatMap(int)}.
	 */
	//@Test
	void testNameMono_flatMap() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link com.star.service.FluxAndMonoGeneratorService#nameMono_flatMapMany(int)}.
	 */
	@Test
	void testNameMono_flatMapMany() {
		var namesFlux = svc.nameMono_flatMapMany(3);
		

		StepVerifier.create(namesFlux)
		            .expectNext("G","A","B","B","E","R")
		            .verifyComplete();
		
		
	}
	@Test
	void testnameFlux_transform() {
		
		var namesFlux = svc.nameFlux_transform(3);
				         
				StepVerifier.create(namesFlux)
	            .expectNext("G","A","B","B","E","R")
	            .verifyComplete();
	}
	
	@Test
	void testnameFlux_transformDefault() {
		
		var namesFlux = svc.nameFlux_transform(15);
				         
				StepVerifier.create(namesFlux)
	            .expectNext("G","A","B","B","E","R")
	            .verifyComplete();
	}
	

}
