package com.sharkjava.springhibernate.service;

import java.util.List;

import com.sharkjava.springhibernate.entity.Student;

public interface StudentService {
  
	public List<Student> getStudents();

	public void saveStudent(Student theStudent);

	public Student getStudents(int id);

	public void deleteStudent(int id);
}
