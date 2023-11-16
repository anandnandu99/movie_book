package com.hexaware.movie_book.controller;

import java.util.List;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hexaware.movie_book.dto.MovieDTO;
import com.hexaware.movie_book.entities.Movie;
import com.hexaware.movie_book.service.IMovieService;


@RestController
@RequestMapping("/api/v1/movies")
public class MovieRestController {


	Logger logger=LoggerFactory.getLogger(MovieRestController.class);
	@Autowired
	private IMovieService service;
	


	

	@GetMapping("/welcome")
    public String welcome() {
        return "Welcome! This endpoint is not secure";
    }

	@PostMapping("/addMovie")
	public Movie addMovie(@RequestBody MovieDTO movieDTO) {
		logger.info("---------------Movie Added----------------");
	    return service.addMovie(movieDTO);
	}

	@GetMapping("/getById/{movieId}")
	public MovieDTO getByMovieId(@PathVariable  int movieId) {
		logger.info("---------------Movie Matches----------------");

	    return service.getByMovieId(movieId);
	}

	@GetMapping("/getAllMovies")
	public List<Movie> getAllMovies() {
	    logger.info("-----------------All Movies-------------------");
		return service.getAllMovies();
	}
	
	@GetMapping("/getByName/{movieName}")
	public MovieDTO getByMovieName(@PathVariable String movieName) {
		logger.info("---------------Movie Matches----------------");

	    return service.getByMovieName(movieName);
	    }
	@DeleteMapping("/deleteById/{movieId}")
    public String deleteByMovieId(@PathVariable int movieId) {
            service.deleteByMovieId(movieId);
            logger.info("---------------Movie Deleted----------------");
            return "Movie deleted successfully";
        
        }
	@DeleteMapping("/deleteByName/{movieName}")
    public String deleteByMovieName(@PathVariable String movieName) {
            service.deleteByMovieName(movieName);
            logger.info("---------------Movie Deleted----------------");
            return "Movie deleted successfully";
}
	@PutMapping("/updateById/{movieId}")
    public Movie updateByMovieId(@PathVariable int movieId, @RequestBody MovieDTO movieDTO) {
         {
            Movie movie = service.updateByMovieId(movieId, movieDTO);

            if (movie != null) {
                logger.info("---------------Movie Updated----------------");
                return movie;
            } else {
                logger.warn("---------------Movie ID Not Found----------------");
                return null;
            }
	}
	}
	
}
	
