package com.hexaware.movieticketbooking.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hexaware.movieticketbooking.dto.AdminDto;
import com.hexaware.movieticketbooking.entity.Admin;
import com.hexaware.movieticketbooking.repository.IAdminRepository;

@Service
public class AdminServiceImp implements IAdminService {
	@Autowired
	IAdminRepository adminRepo;

	@Override
	public Admin insertAdmin(AdminDto adminDto) {
		// TODO Auto-generated method stub
		Admin admin=new Admin();
		admin.setAdminId(adminDto.getAdminId());
		admin.setAdminName(adminDto.getAdminName());
		admin.setPassword(adminDto.getPassword());
		return adminRepo.save(admin);
	}

	@Override
	public Admin updateAdmin(AdminDto adminDto) {
		// TODO Auto-generated method stub
		Admin admin=new Admin();
		admin.setAdminId(adminDto.getAdminId());
		admin.setAdminName(adminDto.getAdminName());
		admin.setPassword(adminDto.getPassword());
		return adminRepo.save(admin);
		
	}

	@Override
	public AdminDto getById(int adminId) {
		// TODO Auto-generated method stub
		Admin admin=adminRepo.findById(adminId).orElse(null);
		AdminDto adminDto=new AdminDto();
		adminDto.setAdminId(admin.getAdminId());
		adminDto.setPassword(admin.getPassword());
		return adminDto;
	}

	@Override
	public List<Admin> getAll() {
		// TODO Auto-generated method stub
		return adminRepo.findAll();

	}

	@Override
	public void deleteAdminById(int adminId) {
		// TODO Auto-generated method stub
		adminRepo.deleteById(adminId);
	}


	

}
