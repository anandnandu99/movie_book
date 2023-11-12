package com.hexaware.movie_book.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hexaware.movie_book.dto.TicketDTO;
import com.hexaware.movie_book.entities.Ticket;
import com.hexaware.movie_book.repository.TicketRepository;

@Service
public class TicketServiceImp implements ITicketService {

    @Autowired
    TicketRepository ticketRepository;

    @Override
    public Ticket bookTicket(TicketDTO ticketDTO) {
        Ticket ticket = new Ticket();

        ticket.setShowId(ticketDTO.getShowId());
        ticket.setSeatNumber(ticketDTO.getSeatNumber());
        
        ticket.setBookingTime(ticketDTO.getBookingTime());

        return ticketRepository.save(ticket);
    }

    @Override
    public TicketDTO getTicketById(Long ticketId) {
        Ticket ticket = ticketRepository.findById(ticketId).orElse(null);

        if (ticket == null) {
            return null;
        }

        return new TicketDTO(
                ticket.getTicketId(),
                ticket.getShowId(),
                ticket.getSeatNumber(),
                ticket.getPrice(),
                
                ticket.getBookingTime()
        );
    }

    @Override
    public List<Ticket> getAllTickets() {
        return ticketRepository.findAll();
    }
}
