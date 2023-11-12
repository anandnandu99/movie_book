package com.hexaware.movieticketbooking.service;

import java.util.List;

import com.hexaware.movieticketbooking.dto.UserDto;
import com.hexaware.movieticketbooking.entity.User;

public interface IUserService {
	public User insertUser(UserDto userDto);
	public User updateUser(UserDto userDto);
	public void deleteUserById(int userId);
	public UserDto getById(int userId);
	public List<User> getAll();

}