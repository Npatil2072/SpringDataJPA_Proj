package com.nt.service;

import com.nt.entity.Doctor;

public interface IDoctorService {
	
	//one mrthod can have only one var arg pararm that to last param of the method
	   //var args are internally arrays
	public Iterable<Doctor> showDoctorBySorting(boolean asc,String ...props);
	
	
	//public String deleteDoctor(Doctor doctor);
	
}