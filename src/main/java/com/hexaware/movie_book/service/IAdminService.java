package com.hexaware.movie_book.service;

import java.util.List;

import com.hexaware.movie_book.dto.AdminDTO;
import com.hexaware.movie_book.entities.Admin;

public interface IAdminService {
		public Admin createAdmin(AdminDTO admindto);
		public Admin updateAdmin(AdminDTO admindto,Long bookingId);
		public void  deleteAdmin(Long adminId);
		public AdminDTO getAdmin(Long adminId);

		public List<Admin>getAllAdmin();
		

	}



