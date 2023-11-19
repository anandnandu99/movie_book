package com.hexaware.movie_book.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.server.ResponseStatusException;

public class MovieNotFoundException extends ResponseStatusException{

	
		private static final long serialVersionUID = 1L;

		public MovieNotFoundException(HttpStatus status, String message) {
			super(status,message);

		}

		
	}


