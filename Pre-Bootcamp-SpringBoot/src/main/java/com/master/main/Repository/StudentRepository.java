package com.master.main.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.master.main.Entities.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {}
