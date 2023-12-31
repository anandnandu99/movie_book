package com.hexaware.movie_book.controller;

import java.io.IOException;
import java.util.List;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
import com.hexaware.movie_book.exception.MovieNotFoundException;
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
		public ResponseEntity<Movie> addMovie(@RequestBody MovieDTO movieDTO)
				throws MovieNotFoundException, IOException {
			Movie movie = service.addMovie(movieDTO);
			logger.info("-------Movie Added Successfully---------");
			return new ResponseEntity<>(movie, HttpStatus.CREATED);
		}
	

	@GetMapping("/getById/{movieId}")
	public MovieDTO getByMovieId(@PathVariable  int movieId)  {
		logger.info("---------------Movie Matches----------------");
		MovieDTO movieDto=service.getByMovieId(movieId);
		if(movieDto.getMovieId()!=movieId) {
			logger.warn("Movie Not Found foe {}" ,movieId);
		
			throw new MovieNotFoundException(HttpStatus.NOT_FOUND,"Movie Not Found for:"+movieId);
			
		}


	    return movieDto;
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
	
