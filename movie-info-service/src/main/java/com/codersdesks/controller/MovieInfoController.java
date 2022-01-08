package com.codersdesks.controller;

import com.codersdesks.dto.MovieInfo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/info")
public class MovieInfoController {

    @GetMapping("/{movieId}")
    public MovieInfo fetchMovie(@PathVariable  String movieId){
        return  new MovieInfo("Test Movie" + movieId,"movie desc "+movieId,movieId);
    }
}
