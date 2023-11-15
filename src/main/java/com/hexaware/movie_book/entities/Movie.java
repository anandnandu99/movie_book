package com.hexaware.movie_book.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.DecimalMax;
import javax.validation.constraints.Digits;
import javax.validation.constraints.NotBlank;
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
}
