package com.learnreactiveprogramming.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Review {
    private Long movie_id;
    private String comment;
    private Double rating;
    
    
    /**
     * 
     * @param movie_id
     * @param comment
     * @param rating
     */
	public Review(Long movie_id, String comment, Double rating) {
		super();
		this.movie_id = movie_id;
		this.comment = comment;
		this.rating = rating;
	}
    
    
  
}
