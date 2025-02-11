package com.nt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import com.nt.entity.Doctor;
import com.nt.service.IDoctorService;

@SpringBootApplication
public class BootDataJpaProj1CrudRepositoryApplication {

	public static void main(String[] args) {
		ApplicationContext ctx=SpringApplication.run(BootDataJpaProj1CrudRepositoryApplication.class, args);
		//get service class obj
		IDoctorService service = ctx.getBean("doctorService",IDoctorService.class);

		/*
		 * try { //create Doctor c;ass object Doctor doctor=new
		 * Doctor();//"raja","MD-cardio",890000.0 doctor.setDocName("raja");
		 * doctor.setSpecialization("MD-cardio"); doctor.setIncome(890000.0); //invoke
		 * the b.method String resultMsg=service.registerDoctor(doctor);
		 * System.out.println(resultMsg); }catch(Exception e){ e.printStackTrace(); }
		 */
		//close th ioc container
		
		/*
		 * try { Doctor doctor=service.showDoctorById(1); System.out.println(doctor); }
		 * catch(Exception e) { System.out.println(e.getMessage());
		 * 
		 * }
		 */
		
		/*
		 * try { Doctor doc=new Doctor(); doc.setDocid(3); doc.setDocName("rishab");
		 * doc.setIncome(60000.0); doc.setSpecialization("cardio-01");
		 * System.out.println(service.registerOrUpdateDoctor(doc)); }catch(Exception e)
		 * { e.printStackTrace(); }
		 */
		
		try {
			System.out.println(service.deleteDoctorByID(102));
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		
		((ConfigurableApplicationContext) ctx).close();

	}

}
