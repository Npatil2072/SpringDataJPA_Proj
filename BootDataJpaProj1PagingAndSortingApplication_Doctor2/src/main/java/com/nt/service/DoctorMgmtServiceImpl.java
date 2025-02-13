package com.nt.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;

import com.nt.entity.Doctor;
import com.nt.repository.IDoctorRepository;

@Service("doctorService")
public class DoctorMgmtServiceImpl implements IDoctorService {
	@Autowired
private IDoctorRepository doctorRepo;

          public Iterable<Doctor> showDoctorBySorting(boolean asc,String... props){
        	  //prepare the sot object
        	  Sort sort=Sort.by(asc?Direction.ASC:Direction.DESC, props);
        	  //use repo
        	  Iterable<Doctor> it=doctorRepo.findAll(sort);
        	  return it;
          }



}
