package com.hexaware.movie_book.service;

import java.util.List;

import com.hexaware.movie_book.dto.TheatreDTO;
import com.hexaware.movie_book.entities.Theatre;

public interface ITheatreService {
    
    Theatre addTheatre(TheatreDTO theatreDTO);

    TheatreDTO getByTheatreId(int theatreId);

    List<Theatre> getAllTheatres();

    TheatreDTO getByTheatreName(String theatreName);

    Theatre updateByTheatreId(int theatreId, TheatreDTO theatreDTO);

    void deleteByTheatreId(int theatreId);

    void deleteAllByTheatreNameAndLocation(String theatreName, String location);
}
