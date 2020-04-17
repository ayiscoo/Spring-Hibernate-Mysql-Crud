package com.sharkjava.springhibernate.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sharkjava.springhibernate.DAO.StudentDAO;
import com.sharkjava.springhibernate.entity.Student;

@Service
public class StudentServiceImpl implements StudentService {
    
	 @Autowired
	  private StudentDAO studentDAO; 
	    
	@Override
	@Transactional
	public List<Student> getStudents() {
		// TODO Auto-generated method stub
		return studentDAO.getStudents();
	}

	@Override
	@Transactional
	public void saveStudent(Student theStudent) {
		// TODO Auto-generated method stub
		 studentDAO.saveStudent(theStudent);
	}

	@Override
	@Transactional
	public Student getStudents(int id) {
		// TODO Auto-generated method stub
		return studentDAO.getStudents(id);
	}

	@Override
	@Transactional
	public void deleteStudent(int id) {
		// TODO Auto-generated method stub
		 studentDAO.deleteStudents(id);
	}

}
