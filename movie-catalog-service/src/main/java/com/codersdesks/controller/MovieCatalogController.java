package com.codersdesks.controller;

import com.codersdesks.config.ApplicationConfig;
import com.codersdesks.dto.CatalogItem;
import com.codersdesks.dto.MovieInfo;
import com.codersdesks.dto.UserRating;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/catalog")
public class MovieCatalogController {

    private RestTemplate restTemplate;

    @Autowired
    private  WebClient.Builder builder;

    @Autowired
    private ApplicationConfig applicationConfig;

    @GetMapping("/{userId}")
    public List<CatalogItem> fetchCatalogItems(@PathVariable String userId){

        UserRating ratings = builder.baseUrl(applicationConfig.getRatingUrl())
                .build().get()
                .uri("user/"+userId)
                .retrieve()
                .bodyToMono(UserRating.class)
                .block();

        //Using Web Client
        return ratings.getUserRating().stream().map(rating -> {
            MovieInfo movie = builder.baseUrl(applicationConfig.getInfoUrl())
                    .build().get()
                    .uri(rating.getMovieId())
                    .retrieve()
                    .bodyToMono(MovieInfo.class)
                    .block();
            return new CatalogItem(movie.getName(), movie.getDesc(), rating.getRating());
        }).collect(Collectors.toList());

         /*
         Using Rest Template
         return ratings.stream().map(rating -> {
             MovieInfo movie = restTemplate.getForObject(movieInfoUrl+rating.getMovieId(), MovieInfo.class);
             return new CatalogItem(movie.getName(), movie.getDesc(), rating.getRating());
        }).collect(Collectors.toList());
          */
    }

    @Autowired
    public void setRestTemplate(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }
}
