package com.master.main.Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Subject {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long sub_id;

    private String name;

    @ManyToOne
    private Student student; 

    public Long getSub_id() {
        return sub_id;
    }

    public void setSub_id(Long sub_id) {
        this.sub_id = sub_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

	@Override
	public String toString() {
		return "Subject [sub_id=" + sub_id + ", name=" + name + ", student=" + student + "]";
	}
    
}