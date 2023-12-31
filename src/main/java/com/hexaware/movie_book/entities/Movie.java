package com.hexaware.movie_book.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.validation.constraints.DecimalMax;
import jakarta.validation.constraints.Digits;
import jakarta.validation.constraints.NotBlank;

/*
  * 
  * @Author:Anand
  * Date:14-11-2023
  * Description:Entity
  */
@Entity
public class Movie {
	@Id
    private int movieId;
	 @NotBlank(message = "Movie name is required")
    private String movieName;
	 @DecimalMax(value = "5.0")

    private Double rating;
    private String director;
    @Digits(integer = 4, fraction = 0)
    private int releaseYear;
    private String language;
    private String description;
	private String discription;
    
	public Movie() {
		super();
	}
	
	public Movie(int movieId, @NotBlank(message = "Movie name is required") String movieName,
			@DecimalMax("5.0") Double rating, String director, @Digits(integer = 4, fraction = 0) int releaseYear,
			String language, String description) {
		super();
		this.movieId = movieId;
		this.movieName = movieName;
		this.rating = rating;
		this.director = director;
		this.releaseYear = releaseYear;
		this.language = language;
		this.description = discription;
	}

	public int getMovieId() {
		return movieId;
		
	}
	public void setMovieId(int movieId) {
		this.movieId = movieId;
	}
	public String getMovieName() {
		return movieName;
	}
	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}
	public Double getRating() {
		return rating;
	}
	public void setRating(Double rating) {
		this.rating = rating;
	}
	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	public int getReleaseYear() {
		return releaseYear;
	}
	public void setReleaseYear(int releaseYear) {
		this.releaseYear = releaseYear;
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	} 

}