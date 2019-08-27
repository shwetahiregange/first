package com.javaTpoint.ratingdataservice.resource;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.javaTpoint.ratingdataservice.model.Rating;
import com.javaTpoint.ratingdataservice.model.UserRating;

@RestController
@RequestMapping("/ratingdata")
public class RatingsResource {
	
	@RequestMapping("/{movieId}")
	public Rating getRating(@PathVariable("movieId") String movieId) {
		
		return new Rating(movieId,4);
	
	}
	
	@RequestMapping("/users/{userId}")
	public UserRating getUserRating(@PathVariable("userId") String userId) {
	List<Rating> ratings= Arrays.asList(
			new Rating("shweta",4),
			new Rating("soumya",4)
			);	
	
     UserRating userRating=new UserRating();
     userRating.setUserRating(ratings);
     return userRating;
}
}

