package com.fullstack.backend.controller;

import com.fullstack.backend.model.Movie;
import com.fullstack.backend.model.MovieTheater;
import com.fullstack.backend.services.MovieTheaterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/app")

public class MovieTheaterController {
    private final MovieTheaterService movieTheaterService;

    @Autowired
    public MovieTheaterController(MovieTheaterService movieTheaterService) {
        this.movieTheaterService = movieTheaterService;
    }

    @GetMapping
    public List<MovieTheater> getClients() {
        return movieTheaterService.getClients();
    }

    @GetMapping("/{id}")
    public List<Movie> getMovieList(@PathVariable Long id) {
        return movieTheaterService.getMovieList(id);
    }

}
