package com.sharkjava.springhibernate.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;






import org.springframework.web.bind.annotation.RequestParam;

import com.sharkjava.springhibernate.entity.Student;
import com.sharkjava.springhibernate.service.StudentService;

@Controller
@RequestMapping("/student")
public class studentController {
    
	@Autowired
	private StudentService studentService;
	
	 @GetMapping("/list")
	public String listStudents(Model theModel){
		List<Student> student = studentService.getStudents();
		theModel.addAttribute("student",student);		 
		return "list-students";
	}
	 
	 @GetMapping("/addStudent")
	 public String addStudent(Model theModel){
		 Student student = new Student();		 
		 theModel.addAttribute("student",student);
		return "student-form"; 
	 }
	 
	 @PostMapping("/addStudent")
	 public String addStudent(@ModelAttribute("student") Student theStudent,BindingResult theResult){
		//System.out.println(theStudent);
		 studentService.saveStudent(theStudent);		 
		 return "redirect:/student/list";
	 }
	 
	 
	 
	 @GetMapping("/showUpdateForm")
	 public String showUpdateForm(@RequestParam("studentID") int id, Model theModel){
		 Student student = studentService.getStudents(id);		 
		 theModel.addAttribute("student",student);
		return "student-form"; 
	 }
	 
	 @GetMapping("/deleteStudent")
	 public String showUpdateForm(@RequestParam("delstudentID") int id){
		   studentService.deleteStudent(id);
		 return "redirect:/student/list";
	 }
	 
	 
}
