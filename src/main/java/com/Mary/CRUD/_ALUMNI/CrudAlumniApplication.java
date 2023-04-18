package com.Mary.CRUD._ALUMNI;

import com.Mary.CRUD._ALUMNI.entity.AlumniEntity;
import com.Mary.CRUD._ALUMNI.repository.AlumniRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CrudAlumniApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(CrudAlumniApplication.class, args);
	}

	@Autowired
	private AlumniRepository alumniRepository;

	@Override
	public void run(String... args) throws Exception {
		AlumniEntity alumniEntity = new AlumniEntity();
		alumniEntity.setAluminID(1233);
		alumniEntity.setAlumniNmae("Alumina");
		alumniEntity.setPhone_no("087654433");
		alumniEntity.setGraduationDate("20/05/2023");
		alumniEntity.setDegreeEarned("ICT");
		alumniRepository.save(alumniEntity);

		AlumniEntity alumniEntity1= new AlumniEntity();
		alumniEntity1.setAluminID(2222);
		alumniEntity1.setAlumniNmae("Mary");
		alumniEntity1.setPhone_no("0755729773");
		alumniEntity1.setGraduationDate("28/05/2023");
		alumniEntity1.setDegreeEarned("ELECTRICAL ENGINEERING");
		alumniRepository.save(alumniEntity1);
	}
}



