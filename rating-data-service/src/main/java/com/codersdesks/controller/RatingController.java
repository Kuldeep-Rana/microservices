package com.codersdesks.controller;

import com.codersdesks.dto.Rating;
import com.codersdesks.dto.UserRating;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/rating")
public class RatingController {

    @GetMapping("/{movieId}")
    public Rating fetchMovieRating(@PathVariable String movieId){
        return new Rating(movieId, 4);
    }


    @GetMapping("/user/{userId}")
    public UserRating fetchUserMovieRating(@PathVariable String userId){
        return new UserRating(Arrays.asList(
         new Rating("1234", 4),
         new Rating("5678", 3),
         new Rating("9012", 5)
        ));
    }
}
