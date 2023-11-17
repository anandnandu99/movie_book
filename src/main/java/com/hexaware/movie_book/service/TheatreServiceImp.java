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
    public TheatreDTO getByTheatreId(int theatreId) {
        Theatre theatre = theatreRepo.findById(theatreId).orElse(null);

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

    @Override
    public TheatreDTO getByTheatreName(String theatreName) {
        Theatre theatre = theatreRepo.findByTheatreName(theatreName);

        TheatreDTO theatreDTO = new TheatreDTO();

        if (theatre != null) {
            theatreDTO.setTheatreId(theatre.getTheatreId());
            theatreDTO.setTheatreName(theatre.getTheatreName());
            theatreDTO.setLocation(theatre.getLocation());
        }

        return theatreDTO;
    }


	@Override
    public Theatre updateByTheatreId(int theatreId, TheatreDTO theatreDTO) {
        Theatre theatre = theatreRepo.findById(theatreId).orElse(null);

        if (theatre != null) {
            theatre.setTheatreName(theatreDTO.getTheatreName());
            theatre.setLocation(theatreDTO.getLocation());

            return theatreRepo.save(theatre);
        } else {
            return null;
        }
    }

	 @Override
	    public void deleteByTheatreId(int theatreId) {
	        Theatre theatre = theatreRepo.findById(theatreId).orElse(null);

	        if (theatre != null) {
	            theatreRepo.delete(theatre);
	        }
	    }
	 @Override
	    public void deleteAllByTheatreNameAndLocation(String theatreName, String location) {
	        // Delete all theatres with the given name and location
	        List<Theatre> theatres = theatreRepo.findAllByTheatreNameAndLocation(theatreName, location);
	        theatreRepo.deleteAll(theatres);
	    }
    
}