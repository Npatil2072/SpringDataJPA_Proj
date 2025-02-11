package com.nt.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.entity.Doctor;
import com.nt.repository.IDoctorRepository;

@Service("doctorService")
public class DoctorMgmtServiceImpl implements IDoctorService {


	@Autowired
private IDoctorRepository doctorRepo;

@Override
	public String registerDoctor(Doctor doctor) {
		System.out.println("doc id(before save::"+doctor.getDocid());

		Doctor doc=doctorRepo.save(doctor);
		
		return "Doctor obj saved with is value:"+doc.getDocid();
	}

     @Override
      public Doctor showDoctorById(Integer id) {
	          Doctor dutyDoctor=new Doctor();
	          dutyDoctor.setSpecialization("duty Doctor");
	          Doctor doctor = doctorRepo.findById(id).orElse(dutyDoctor);
	          
	    return doctor;
     }
     
     @Override
    public String registerOrUpdateDoctor(Doctor doctor) {
    	//load Doctor object 
    	 Optional<Doctor> opt=doctorRepo.findById(doctor.getDocid());
    	if(opt.isPresent()) {
    		doctorRepo.save(doctor);  //for update object operatino
    		return doctor.getDocid()+"doctor details are found and update";    		
    	}
    	else {
    	 return "doctor is saved with is value :"+doctorRepo.save(doctor).getDocid();
    	                                                                                             //for save object operation
    	}
    }
     
@Override
    public String updateDoctorname(int id, String name) {
    	// TODO Auto-generated method stub
    	return null;
    			}

          @Override
        public String deleteDoctorByID(Integer id) {
        	//Load object
        	  Optional<Doctor> opt=doctorRepo.findById(id);
        	  if(opt.isPresent()) {
        		  doctorRepo.deleteById(id);
        		  return id+"Doctor is deleted";
        	  }else {
        	return id+"Doctor not found for deletion";
        	  }
        }





}
