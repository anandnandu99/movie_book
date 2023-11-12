package com.hexaware.movie_book.controller;

import java.util.List;

import javax.validation.Valid;
import javax.validation.constraints.Min;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hexaware.movie_book.dto.ShowsDTO;
import com.hexaware.movie_book.entities.Shows;
import com.hexaware.movie_book.service.IShowsService;

@RestController
@RequestMapping("/api/shows")
public class ShowsRestController {

    @Autowired
    private IShowsService showsService;

    @PostMapping("/add")
    public Shows addShow(@RequestBody ShowsDTO showsDTO) {
        return showsService.addShow(showsDTO);
    }

    @GetMapping("/get/{showId}")
    public ShowsDTO getShowById(@PathVariable @Valid @Min(1) int showId) {
        return showsService.getById(showId);
    }

    @GetMapping("/getall")
    public List<Shows> getAllShows() {
        return showsService.getAll();
    }

}
