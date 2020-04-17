package com.sharkjava.springhibernate.DAO;

import java.util.List;

import com.sharkjava.springhibernate.entity.Student;

public interface StudentDAO {

	 public List<Student> getStudents();

	public void saveStudent(Student theStudent);

	public Student getStudents(int id);

	public void deleteStudents(int id);
}
