package com.hexaware.movie_book.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hexaware.movie_book.entities.Shows;

public interface ShowsRepository extends JpaRepository<Shows, Integer> {

}
