package com.hexaware.movie_book.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hexaware.movie_book.entities.Theatre;

@Repository
public interface TheatreRepository extends JpaRepository<Theatre, Integer> {

}
