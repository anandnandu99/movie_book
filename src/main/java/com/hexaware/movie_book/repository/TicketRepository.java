package com.hexaware.movie_book.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hexaware.movie_book.entities.Ticket;

@Repository
public interface TicketRepository extends JpaRepository<Ticket, Long> {
}
