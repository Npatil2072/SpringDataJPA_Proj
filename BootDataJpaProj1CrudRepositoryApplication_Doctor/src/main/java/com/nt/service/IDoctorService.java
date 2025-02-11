

package com.nt.service;

import com.nt.entity.Doctor;

public interface IDoctorService {
	public String registerDoctor(Doctor doctor);
	
	public Doctor showDoctorById(Integer id);
	
	public String registerOrUpdateDoctor(Doctor doctor);
	
	public String updateDoctorname(int id,String name);
	
	public String deleteDoctorByID(Integer id);
	
	//public String deleteDoctor(Doctor doctor);
	
}

