package com.hexaware.movieticketbooking.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hexaware.movieticketbooking.dto.UserDto;
import com.hexaware.movieticketbooking.entity.User;
import com.hexaware.movieticketbooking.service.UserServiceImp;

@RestController
@RequestMapping("/api/user")
public class UserRestController {
	
	@Autowired
	UserServiceImp obj;
    @PostMapping(value="/add")
    public User insertUser(@RequestBody UserDto userDto) {
    	return obj.insertUser(userDto);
    }
    @PutMapping(value="update")
    public User updateUser(@RequestBody UserDto userDto)
    {
    	return obj.updateUser(userDto);
    }
    @GetMapping(value="/get/{userId}")
    public UserDto getById(@PathVariable int userId)
    {
    	return obj.getById(userId);
    }
    @GetMapping(value="/getall")
	   public List<User> getAllUser()
	   {
		   return obj.getAll();
	   }
    @DeleteMapping("/delete/{userId}")
    public void deleteUserById(@PathVariable int userId)
    {
    	 obj.deleteUserById(userId);
    }

}
