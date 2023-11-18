package com.hexaware.movie_book.controller;

import java.util.List;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hexaware.movie_book.dto.ShowsDTO;
import com.hexaware.movie_book.entities.Shows;
import com.hexaware.movie_book.service.IShowsService;

import jakarta.validation.Valid;
import jakarta.validation.constraints.Min;

@RestController
@RequestMapping("/api/v1/shows")
public class ShowsRestController {
	Logger logger=LoggerFactory.getLogger(MovieRestController.class);

    @Autowired
    private IShowsService showsService;

    @PostMapping("/add")
    public Shows addShow(@RequestBody ShowsDTO showsDTO) {
		logger.info("---------------Show Added----------------");

        return showsService.addShow(showsDTO);
    }

    @GetMapping("/get/{showId}")
    public ShowsDTO getShowById(@PathVariable @Valid @Min(1) int showId) {
		logger.info("---------------Show by ID----------------");

        return showsService.getById(showId);
    }

    @GetMapping("/getall")
    public List<Shows> getAllShows() {
		logger.info("---------------Shows----------------");

        return showsService.getAll();
    }
    @PutMapping("/update/{showId}")
    public Shows updateByShowId(@PathVariable int showId,@RequestBody ShowsDTO showsDTO) {
    	return showsService.updateByShowId(showId,showsDTO);
    }
    @DeleteMapping("/deleteByShowId/{showId}")
    public String deleteById(@PathVariable int showId){
    	showsService.deleteByShowId(showId);
    	return "Show Deleted";
    }
    

}
