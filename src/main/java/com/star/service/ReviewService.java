package com.star.service;

import com.learnreactiveprogramming.domain.Review;
import reactor.core.publisher.Flux;

import java.util.List;

public class ReviewService {

    public  List<Review> retrieveReviews(long MovieId){

     	Review rvOne = new Review(MovieId, "Awesome Movie", 7.6);
    	Review rvTwo = new Review(MovieId, "Excellent Movie", 9.0);
    	
    	
    	
        var reviewsList =List.of(rvOne,rvTwo);
        return (List<Review>) reviewsList;
    }

    public Flux<Review> retrieveReviewsFlux(long MovieId){

    	Review rvOne = new Review(MovieId, "Awesome Movie", 7.6);
    	Review rvTwo = new Review(MovieId, "Excellent Movie", 9.0);
    	
        var reviewsList = List.of(rvOne,rvTwo);
        return Flux.fromIterable(reviewsList);
    }
}
