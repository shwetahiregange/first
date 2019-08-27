package com.javaTpoint.resources;

import java.util.List;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import com.javaTpoint.model.CatalogItem;
import com.javaTpoint.model.Movie;
import com.javaTpoint.model.UserRating;


@RestController
@RequestMapping("/catalog")
public class MovieCatalogResource {
	
	@Autowired
	private RestTemplate restTemplate;
	
//	@Autowired
//	private WebClient.Builder webClientBuilder;
	
	@RequestMapping("/{userId}")
	public List<CatalogItem> getCatalog(@PathVariable("userId")String userId){
		
		UserRating ratings= restTemplate.getForObject("http://localhost:8083/ratingdata/users/"+ userId, UserRating.class);
		
		return ratings.getUserRating().stream().map(rating-> {
		Movie movie =	restTemplate.getForObject("http://localhost:8082/movies/" + rating.getMovieId() , Movie.class);
			
//			Movie movie =	webClientBuilder.build()
//			.get()
//			.uri("http://localhost:8082/movies/" + rating.getMovieId())
//			.retrieve()
//			.bodyToMono(Movie.class).block();
			
			return new CatalogItem(movie.getMovieName() ,"Test", rating.getRating());
			})
				.collect(Collectors.toList());
	}

}
