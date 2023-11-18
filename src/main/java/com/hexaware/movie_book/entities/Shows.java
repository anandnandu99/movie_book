package com.hexaware.movie_book.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;

@Entity
public class Shows {
    @Id
    private int showId;
    @NotBlank
    private String showName;
    private int theatreId; 
    private String movieName;


    public Shows() {
		super();
	}

	public Shows(int showId, @NotBlank String showName,  int theatreId, String movieName) {
		super();
		this.showId = showId;
		this.showName = showName;
		this.theatreId = theatreId;
		this.movieName = movieName;
	}

	public int getShowId() {
        return showId;
    }

    public void setShowId(int showId) {
        this.showId = showId;
    }

    public String getShowName() {
        return showName;
    }

    public void setShowName(String showName) {
        this.showName = showName;
    }

   

  

    public int getTheatreId() {
        return theatreId;
    }

    public void setTheatreId(int theatreId) {
        this.theatreId = theatreId;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }
}
