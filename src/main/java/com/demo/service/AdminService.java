package com.demo.service;

import java.util.List;

import com.demo.entity.MVVMstaff;
import com.demo.entity.StaffDetails;

public interface AdminService {
	public abstract List<StaffDetails>findAll();
	public abstract StaffDetails findById(int theId);
	public abstract void save(MVVMstaff theAdmin);
	public abstract void save(StaffDetails theAdmin);
	public abstract void deleteById(int theId);
}