package com.hexaware.movie_book.service;

import java.util.List;

import com.hexaware.movie_book.dto.TheatreDTO;
import com.hexaware.movie_book.entities.Theatre;

public interface ITheatreService {
    public Theatre addTheatre(TheatreDTO theatreDTO);
    public TheatreDTO getById(int pid);
    public List<Theatre> getAllTheatres();
}
