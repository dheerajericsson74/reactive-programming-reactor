package com.star.service;

import java.util.List;
import java.util.function.Function;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public class FluxAndMonoGeneratorService {

	
	
	private static final List<String> RAMGHAR_KAI_WASI = List.of("kaliya", "sambha", "gabber", "ramlal", "rahim chaha", "jay", "veru", "thakur","shaniya", "ramlal", "Thanno", "Mausi");
	
	
	private static final List<String> GABBER_GANG =  List.of("kaliya", "sambha", "gabber","dhaniya");
	private static final List<String> TEAM_THAKUR =  List.of("thakur", "jay", "veru","ramlal","rahim chaha","dhanno","basanti");
	private static final List<String> JAY_VERU =  List.of("Surma Bhopali","Jailer","Hariram nai");
	/**
	 * 
	 * @return
	 */

	public Flux<String> namesFlux() {

		return Flux.fromIterable(RAMGHAR_KAI_WASI)
				.log();
	}
	
	
	
	
	public Flux<String> namesFlux_map() {

		return Flux.fromIterable(RAMGHAR_KAI_WASI)
				.map(String:: toUpperCase)
				.log();
	}
	
	
	/**
	 * 
	 * @return
	 */
	public Mono<String> nameMono(){
		
		return Mono.just("Gabber");
		
	}

	/**
	 * 
	 * @param strLng
	 * @return
	 */
	
	public Mono<List<String>> nameMono_flatMap(int strLng){
		
		return Mono.just("Gabber")
				   .map(String::toUpperCase)
				   .filter(s -> s.length() > strLng)
				   .flatMap(this::splitStringMono)
				   .log(); //Mono<List of G a b b e r>
	}
	/**
	 * 
	 * @param strLng
	 * @return
	 */
	public Flux<String> nameMono_flatMapMany(int strLng){
		
		return Mono.just("Gabber")
				   .map(String::toUpperCase)
				   .filter(s -> s.length() > strLng)
				   .flatMapMany(this::splitString)
				   .log();
	}
	/**
	 * 
	 * @param str
	 * @return
	 */
	public Flux<String> splitString(String str){
		
		var charArray = str.split("");
		
		return Flux.fromArray(charArray);
		
	}
	
	/**
	 * 
	 * @param str
	 * @return
	 */
	private Mono<List<String>> splitStringMono(String str){
		
		var charArray = str.split("");
		var charList =List.of(charArray);
				
		return Mono.just(charList);
		
	}
	
	/**
	 * 
	 * @param strLng
	 * @return
	 */

	public Flux<String> nameFlux_transform(int strLng) {

		Function<Flux<String>, Flux<String>> fi = name -> name.map(String::toUpperCase)
				.filter(s -> s.length() > strLng)
				.log();

		return Flux.fromIterable(TEAM_THAKUR).transform(fi).flatMap(s -> splitString(s)).log();

	}
	
	
	
	
	
	
	
}

