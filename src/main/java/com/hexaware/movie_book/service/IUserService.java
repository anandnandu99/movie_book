package com.hexaware.movie_book.service;

import java.util.List;

import com.hexaware.movie_book.dto.UserDTO;
import com.hexaware.movie_book.entities.User;




public interface IUserService {

	public User createUser(UserDTO usercustomerdto);
	public User updateUser(UserDTO usercustomerdto,Long userId);
	public void  deleteUser(Long userId);
	public UserDTO getUserById(Long userId);
	public List<User>getAllUser();
	
	

}
