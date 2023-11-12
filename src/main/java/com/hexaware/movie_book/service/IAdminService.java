package com.hexaware.movieticketbooking.service;

import java.util.List;

import com.hexaware.movieticketbooking.dto.AdminDto;
import com.hexaware.movieticketbooking.entity.Admin;

public interface IAdminService {
	public Admin insertAdmin(AdminDto adminDto);
	public Admin updateAdmin(AdminDto adminDto);
	public void deleteAdminById(int adminId);
	public AdminDto getById(int adminId);
	public List <Admin> getAll();	

}
