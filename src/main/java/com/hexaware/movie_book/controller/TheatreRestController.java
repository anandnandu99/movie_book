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

import com.hexaware.movie_book.dto.TheatreDTO;
import com.hexaware.movie_book.entities.Theatre;
import com.hexaware.movie_book.service.ITheatreService;

@RestController
@RequestMapping("/api/theatres")
public class TheatreRestController {

    @Autowired
    ITheatreService service;

    @GetMapping("/welcome")
    public String welcome() {
        return "Welcome! This endpoint is not secure";
    }

    @PostMapping("/add")
    public Theatre addTheatre(@RequestBody TheatreDTO theatreDTO) {
        return service.addTheatre(theatreDTO);
    }

    @GetMapping("/get/{pid}")
    public TheatreDTO getById(@PathVariable @Valid @Min(1) int pid) {
        return service.getById(pid);
    }

    @GetMapping("/getall")
    public List<Theatre> getAllTheatres() {
        return service.getAllTheatres();
    }
}
