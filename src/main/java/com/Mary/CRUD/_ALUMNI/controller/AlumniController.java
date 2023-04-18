package com.Mary.CRUD._ALUMNI.controller;

import com.Mary.CRUD._ALUMNI.entity.AlumniEntity;
import com.Mary.CRUD._ALUMNI.exception.AlumniNotFoundException;
import com.Mary.CRUD._ALUMNI.repository.AlumniRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.nio.file.ProviderNotFoundException;
import java.util.List;
@RestController
@RequestMapping("/api/v1/Alumni")
public class AlumniController {
        @Autowired
        private AlumniRepository AlumniRepository;
        @GetMapping
        public List<AlumniEntity> getAllProposal(){
            return AlumniRepository.findAll();
        }
        //code for adding Alumni(create)
        @PostMapping
        public AlumniEntity createProposal(@RequestBody AlumniEntity alumniEntity){
            return  AlumniRepository.save(alumniEntity);

        }
        //code for reading proposal
        @GetMapping("{id}")
        public ResponseEntity<AlumniEntity> getProposalById(long id){
            AlumniEntity alumniEntity=AlumniRepository.findById(id)
                    .orElseThrow(()->new AlumniNotFoundException("proposal are not Found"));
            return  ResponseEntity.ok(alumniEntity);
        }
        //code for modifying proposal
        @PutMapping("{id}")
        public  ResponseEntity<AlumniEntity>  updateProposalById(@PathVariable long id, @RequestBody AlumniEntity alumniEntityDetails){
            AlumniEntity alumniEntity=AlumniRepository.findById(id)
                    .orElseThrow(()->new ProviderNotFoundException("proposal not Found "));

            alumniEntity.setAlumniNmae(alumniEntityDetails.getAlumniNmae());
            alumniEntity.setAluminID(alumniEntityDetails.getAluminID());
            alumniEntity.setDegreeEarned(alumniEntityDetails.getDegreeEarned());
            alumniEntity.setPhone_no(alumniEntityDetails.getPhone_no());
            alumniEntity.setGraduationDate(alumniEntityDetails.getAlumniNmae());

            AlumniRepository.save(alumniEntity);
            return ResponseEntity.ok(alumniEntity);
        }

        //code for deleting proposal
        @DeleteMapping("{id}")
        public ResponseEntity<AlumniEntity> deleteProposal(@PathVariable long id){
            AlumniEntity deleteAluminate = AlumniRepository.findById(id)
                    .orElseThrow(()->new AlumniNotFoundException("not found"));

            AlumniRepository.delete(deleteAluminate);
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
}
