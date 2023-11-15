package com.hexaware.movie_book.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hexaware.movie_book.dto.MovieDTO;
import com.hexaware.movie_book.entities.Movie;
import com.hexaware.movie_book.service.IMovieService;

import jakarta.validation.Valid;
import jakarta.validation.constraints.Min;


@RestController
@RequestMapping("/api/movies")
public class MovieRestController {
	@Autowired

	private IMovieService service;
	


	public MovieRestController(IMovieService service) {
		super();
		this.service = service;
	}

	@GetMapping("/welcome")
    public String welcome() {
        return "Welcome! This endpoint is not secure";
    }

	@PostMapping("/add")
	public Movie addMovie(@RequestBody MovieDTO movieDTO) {
	    return service.addMovie(movieDTO);
	}

	@GetMapping("/get/{pid}")
	public MovieDTO getById(@PathVariable @Valid @Min(1) int pid) {
	    return service.getById(pid);
	}

	@GetMapping("/getall")
	public List<Movie> getAllMovies() {
	    return service.getAllMovies();
	}


}
