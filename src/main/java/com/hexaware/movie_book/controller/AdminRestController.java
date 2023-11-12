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

import com.hexaware.movieticketbooking.dto.AdminDto;
import com.hexaware.movieticketbooking.entity.Admin;
import com.hexaware.movieticketbooking.service.AdminServiceImp;

@RestController
@RequestMapping("/api/admin")
public class AdminRestController {
	
	@Autowired
	AdminServiceImp obj;
    @PostMapping(value="/add")
    public Admin insertAdmin(@RequestBody AdminDto adminDto) {
    	return obj.insertAdmin(adminDto);
    }
    @PutMapping(value="update")
    public Admin updateAdmin(@RequestBody AdminDto adminDto)
    {
    	return obj.updateAdmin(adminDto);
    }
    @GetMapping(value="/get/{adminId}")
    public AdminDto getById(@PathVariable int adminId)
    {
    	return obj.getById(adminId);
    }
    @GetMapping(value="/getall")
	   public List<Admin> getAllAdmin()
	   {
		   return obj.getAll();
	   }
    @DeleteMapping("/delete/{adminId}")
    public void deleteAdminById(@PathVariable int adminId)
    {
    	 obj.deleteAdminById(adminId);
    }

}
