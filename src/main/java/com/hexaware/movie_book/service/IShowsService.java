package com.hexaware.movie_book.service;

import java.util.List;

import com.hexaware.movie_book.dto.ShowsDTO;
import com.hexaware.movie_book.entities.Shows;

public interface IShowsService {
   public Shows addShow(ShowsDTO showsDTO);

    public ShowsDTO getById(int showId);

    List<Shows> getAll();
     public Shows updateByShowId(int showId, ShowsDTO showsDTO);

    void deleteByShowId(int showId);

   /*
    * 
    *  
    *  List<ShowsDTO> getShowsByTheatreId(int theatreId);
    *  List<ShowsDTO> getShowsByMovieName(String movieName);

    */

    
}
