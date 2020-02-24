package com.example.moviescatalogservice.resources;


import com.example.moviescatalogservice.models.CatalogItem;
import com.example.moviescatalogservice.models.Movie;
import com.example.moviescatalogservice.models.Rating;
import com.example.moviescatalogservice.models.UserRating;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/catalog")
public class CatalogResource {

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    WebClient.Builder webClientBuilder;

    @RequestMapping()
    public String defaultMethod(){

        return  "Hello I am Movies Catalog";
    }

    @RequestMapping("/{userId}")
    public CatalogItem getCatalog(@PathVariable("userId") String userId) {

        System.out.println("movies catelog executing => "+userId);

//        UserRating userRating = restTemplate.getForObject("http://ratings-data-service/ratingsdata/user/" + 1, UserRating.class);
        Rating rating= restTemplate.getForObject("http://ratings-data-service/ratingsdata/user/" + 1, Rating.class);
        System.out.println("movies user rating executing => "+rating);
//        return userRating.getRatings().stream()
//                .map(rating -> {
//                    Movie movie = restTemplate.getForObject("http://movies-info-service/movies/" + rating.getMovieId(), Movie.class);
//                    return new CatalogItem(movie.getName(), movie.getDescription(), rating.getRating(),new Random().nextInt(100));
//                })
//                .collect(Collectors.toList());
        Movie movie = restTemplate.getForObject("http://movies-info-service/movies/" + rating.getMovieId(),Movie.class);
        System.out.println("movies details => "+movie);
        return new CatalogItem(movie.getName(),movie.getDescription(),rating.getRating(),new Random().nextInt(100));

    }
}

/*
Alternative WebClient way
Movie movie = webClientBuilder.build().get().uri("http://localhost:8082/movies/"+ rating.getMovieId())
.retrieve().bodyToMono(Movie.class).block();
*/
