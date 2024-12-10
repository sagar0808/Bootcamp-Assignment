package com.master.main.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.master.main.Entities.Subject;

@Repository
public interface SubjectRepository extends JpaRepository<Subject, Integer> {}
