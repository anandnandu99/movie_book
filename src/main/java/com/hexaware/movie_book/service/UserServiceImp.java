package com.hexaware.movieticketbooking.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hexaware.movieticketbooking.dto.UserDto;
import com.hexaware.movieticketbooking.entity.User;
import com.hexaware.movieticketbooking.repository.IUserRepository;

@Service
public class UserServiceImp implements IUserService {
	@Autowired
	IUserRepository userRepo;

	@Override
	public User insertUser(UserDto userDto) {
		// TODO Auto-generated method stub
		User user=new User();
		user.setId(userDto.getId());
		user.setUsername(userDto.getUsername());
		user.setPassword(userDto.getPassword());
		return userRepo.save(user);
	}

	@Override
	public User updateUser(UserDto userDto) {
		// TODO Auto-generated method stub
		User user=new User();
		user.setId(userDto.getId());
		user.setUsername(userDto.getUsername());
		user.setPassword(userDto.getPassword());
		return userRepo.save(user);
	}

	@Override
	public void deleteUserById(int userId) {
		// TODO Auto-generated method stub
		userRepo.deleteById(userId);
	}

	@Override
	public UserDto getById(int userId) {
		// TODO Auto-generated method stub
		User user = userRepo.findById(userId).orElse(null);
		UserDto userDto=new UserDto();
		userDto.setId(user.getId());
		userDto.setPassword(user.getPassword());
		return userDto;
	}

	@Override
	public List<User> getAll() {
		// TODO Auto-generated method stub
		return userRepo.findAll();
	}

}
