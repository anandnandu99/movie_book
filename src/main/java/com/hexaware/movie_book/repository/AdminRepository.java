package com.hexaware.movie_book.repository;


	import org.springframework.data.jpa.repository.JpaRepository;
	import org.springframework.stereotype.Repository;

import com.hexaware.movie_book.entities.Admin;



	@Repository
	public interface AdminRepository extends JpaRepository<Admin,Long > {

	}



