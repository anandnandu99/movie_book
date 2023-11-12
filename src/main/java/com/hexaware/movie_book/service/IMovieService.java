package com.hexaware.movie_book.service;

import java.util.List;

import com.hexaware.movie_book.dto.MovieDTO;
import com.hexaware.movie_book.entities.Movie;

public interface IMovieService {
    public Movie addMovie(MovieDTO movieDTO);
    public MovieDTO getById(int pid);
    public List<Movie> getAllMovies();
    public List<MovieDTO> getByName(String movieName);
    public List<MovieDTO> getByRating(Double rating);
    public List<MovieDTO> getByDirector(String director);
    public List<MovieDTO> getByLanguage(String language);
}
