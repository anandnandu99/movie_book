package com.hexaware.movie_book.controller;

import java.util.List;

import javax.validation.Valid;
import javax.validation.constraints.Min;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.hexaware.movie_book.dto.TheatreDTO;
import com.hexaware.movie_book.entities.Theatre;
import com.hexaware.movie_book.service.ITheatreService;

@RestController
@RequestMapping("/api/v1/theatres")
public class TheatreRestController {
    Logger logger = LoggerFactory.getLogger(TheatreRestController.class);

    @Autowired
    ITheatreService service;

    @GetMapping("/welcome")
    public String welcome() {
        return "Welcome! This endpoint is not secure";
    }

    @PostMapping("/add")
    public Theatre addTheatre(@RequestBody TheatreDTO theatreDTO) {
        logger.info("---------------Theatre Added----------------");
        return service.addTheatre(theatreDTO);
    }

    @GetMapping("/get/{theatreId}")
    public TheatreDTO getByTheatreId(@PathVariable @Valid @Min(1) int theatreId) {
        logger.info("---------------Theatre By ID----------------");
        return service.getByTheatreId(theatreId);
    }

    @GetMapping("/getByName/{theatreName}")
    public TheatreDTO getByTheatreName(@PathVariable String theatreName) {
        logger.info("---------------Theatre By Name----------------");
        return service.getByTheatreName(theatreName);
    }

    @GetMapping("/getall")
    public List<Theatre> getAllTheatres() {
        logger.info("---------------All Theatres----------------");
        return service.getAllTheatres();
    }

    @PutMapping("/update/{theatreId}")
    public Theatre updateByTheatreId(
            @PathVariable @Valid @Min(1) int theatreId,
            @RequestBody TheatreDTO theatreDTO) {
        logger.info("---------------Theatre Updated----------------");
        return service.updateByTheatreId(theatreId, theatreDTO);
    }

    @DeleteMapping("/delete/{theatreId}")
    public String deleteByTheatreId(@PathVariable @Valid @Min(1) int theatreId) {
        logger.info("---------------Theatre Deleted----------------");
        service.deleteByTheatreId(theatreId);
        return "Theatre Deleted";
    }

    @DeleteMapping("/deleteAllByNameAndLocation/{theatreName}/{location}")
    public String deleteAllByTheatreNameAndLocation(
            @PathVariable String theatreName,
            @PathVariable String location) {
        logger.info("---------------All Theatres with the same name and location Deleted----------------");
        service.deleteAllByTheatreNameAndLocation(theatreName, location);
        return "Theatre Deleted";
    }
}
