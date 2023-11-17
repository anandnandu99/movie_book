package com.hexaware.movie_book.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hexaware.movie_book.dto.ShowsDTO;
import com.hexaware.movie_book.entities.Shows;
import com.hexaware.movie_book.repository.ShowsRepository;

import java.util.List;

@Service
public class ShowsServiceImp implements IShowsService {

    @Autowired
    private ShowsRepository showsRepository;

    @Override
    public Shows addShow(ShowsDTO showsDTO) {
        Shows shows = new Shows();

        shows.setShowId(showsDTO.getShowId());
        shows.setShowName(showsDTO.getShowName());
        shows.setTheatreId(showsDTO.getTheatreId());
        shows.setMovieName(showsDTO.getMovieName());

        return showsRepository.save(shows);
    }

    @Override
    public ShowsDTO getById(int showId) {
        Shows shows = showsRepository.findById(showId).orElse(null);

        if (shows == null) {
            return null;
        }

        ShowsDTO showsDTO = new ShowsDTO();
        showsDTO.setShowId(shows.getShowId());
        showsDTO.setShowName(shows.getShowName());
        showsDTO.setTheatreId(shows.getTheatreId());
        showsDTO.setMovieName(shows.getMovieName());

        return showsDTO;
    }
    @Override
    public List<Shows> getAll() {
        return showsRepository.findAll();
    }

	@Override
	public Shows updateByShowId(int showId, ShowsDTO showsDTO) {
		Shows shows=new Shows();

        shows.setShowId(showsDTO.getShowId());
        shows.setShowName(showsDTO.getShowName());
        shows.setTheatreId(showsDTO.getTheatreId());
        shows.setMovieName(showsDTO.getMovieName());

        return showsRepository.save(shows);
    }

	@Override
	public void deleteByShowId(int showId) {
		Shows show=showsRepository.findById(showId).orElse(null);
		
		showsRepository.delete(show);
	}

	
}

