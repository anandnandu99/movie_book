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

import com.hexaware.movie_book.dto.TicketDTO;
import com.hexaware.movie_book.entities.Ticket;
import com.hexaware.movie_book.service.ITicketService;

@RestController
@RequestMapping("/api/tickets")
public class TicketRestController {

    @Autowired
    ITicketService ticketService;

    @PostMapping("/book")
    public Ticket bookTicket(@RequestBody TicketDTO ticketDTO) {
        return ticketService.bookTicket(ticketDTO);
    }

    @GetMapping("/get/{ticketId}")
    public TicketDTO getTicketById(@PathVariable @Valid @Min(1) Long ticketId) {
        return ticketService.getTicketById(ticketId);
    }

    @GetMapping("/getall")
    public List<Ticket> getAllTickets() {
        return ticketService.getAllTickets();
    }
}
