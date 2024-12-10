package com.master.main.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.master.main.Entities.Student;
import com.master.main.Repository.StudentRepository;

@RestController
@RequestMapping("/test/students")
public class StudentController {
	
	@Autowired
	private StudentRepository studentRepository;
	
	@PostMapping
	public ResponseEntity<Student> createStudent(@RequestBody Student student) {
		
		return ResponseEntity.ok(studentRepository.save(student));
	}
	
	@PutMapping
	public ResponseEntity<List<Student>> getAllStudents(){
		
		return ResponseEntity.ok(studentRepository.findAll());
	}
}

