package com.hexaware.movie_book.controller;

import java.util.List;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hexaware.movie_book.dto.TicketDTO;
import com.hexaware.movie_book.entities.Ticket;
import com.hexaware.movie_book.service.ITicketService;

import jakarta.validation.Valid;
import jakarta.validation.constraints.Min;

@RestController
@RequestMapping("/api/v1/tickets")
public class TicketRestController {
	Logger logger=LoggerFactory.getLogger(MovieRestController.class);

    @Autowired
    ITicketService ticketService;

    @PostMapping("/book")
    public Ticket bookTicket(@RequestBody TicketDTO ticketDTO) {
    	Ticket ticket=ticketService.bookTicket(ticketDTO);
		logger.info("---------------Ticket Booked----------------");

        return ticket;
    }

    @GetMapping("/get/{ticketId}")
    public TicketDTO getTicketById(@PathVariable @Valid @Min(1) Long ticketId) {
		logger.info("---------------Get Ticket----------------");

        return ticketService.getTicketById(ticketId);
    }

    @GetMapping("/getall")
    public List<Ticket> getAllTickets() {
		logger.info("---------------All Tickets----------------");

        return ticketService.getAllTickets();
    }
    @DeleteMapping("/deleteByTicketId/{ticketId}")
    public String deleteById(@PathVariable Long ticketId){
    	ticketService.deleteByTicketId(ticketId);
    	return "Ticket Cancel";
    
    }
}
