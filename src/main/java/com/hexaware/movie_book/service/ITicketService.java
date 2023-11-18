package com.hexaware.movie_book.service;

import java.util.List;

import com.hexaware.movie_book.dto.TicketDTO;
import com.hexaware.movie_book.entities.Ticket;

public interface ITicketService {
    Ticket bookTicket(TicketDTO ticketDTO);
    TicketDTO getTicketById(Long ticketId);
    List<Ticket> getAllTickets();
    void deleteByTicketId(Long ticketId);
    
}
