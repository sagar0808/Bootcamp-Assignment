package com.master.main.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.master.main.Entities.Subject;
import com.master.main.Repository.SubjectRepository;

@RestController
@RequestMapping("/test/subjects")
public class SubjectController {
	
	@Autowired
	private SubjectRepository subjectRepository;
	
	@PostMapping
	public ResponseEntity<Subject> createSubject(@RequestBody Subject subject){
		
		return ResponseEntity.ok(subjectRepository.save(subject));
	}
	
	@GetMapping
	public ResponseEntity<List<Subject>> getAllSubjects(){
		
		return ResponseEntity.ok(subjectRepository.findAll());
	}
}

