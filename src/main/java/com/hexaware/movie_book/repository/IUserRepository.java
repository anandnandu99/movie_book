package com.hexaware.movieticketbooking.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hexaware.movieticketbooking.entity.User;

@Repository
public interface IUserRepository extends JpaRepository<User,Integer>{

}
