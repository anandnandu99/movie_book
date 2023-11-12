package com.hexaware.movie_book.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hexaware.movie_book.dto.TheatreDTO;
import com.hexaware.movie_book.entities.Theatre;
import com.hexaware.movie_book.repository.TheatreRepository;

@Service
public class TheatreServiceImp implements ITheatreService {

    @Autowired
    TheatreRepository theatreRepo;

    @Override
    public Theatre addTheatre(TheatreDTO theatreDTO) {
        Theatre theatre = new Theatre();

        theatre.setTheatreId(theatreDTO.getTheatreId());
        theatre.setTheatreName(theatreDTO.getTheatreName());
        theatre.setLocation(theatreDTO.getLocation());

        return theatreRepo.save(theatre);
    }

    @Override
    public TheatreDTO getById(int pid) {
        Theatre theatre = theatreRepo.findById(pid).orElse(null);

        TheatreDTO theatreDTO = new TheatreDTO();

        theatreDTO.setTheatreId(theatre.getTheatreId());
        theatreDTO.setTheatreName(theatre.getTheatreName());
        theatreDTO.setLocation(theatre.getLocation());

        return theatreDTO;
    }

    @Override
    public List<Theatre> getAllTheatres() {
        return theatreRepo.findAll();
    }
}
