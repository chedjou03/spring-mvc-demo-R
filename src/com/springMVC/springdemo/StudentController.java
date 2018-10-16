package com.springMVC.springdemo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/student")
public class StudentController 
{
	
	@RequestMapping("/showStudentRegistrationForm")
	public String showForm(Model theModel) 
	{
		
		// create a new student object
		Student theStudent = new Student();
		
		//add student to model as model attribute
		theModel.addAttribute("student",theStudent);
		
		return "student-registration-form";
	}
	
	
	
	@RequestMapping("/processStudentRegistrationForm")
	public String processStudentRegistrationForm(@ModelAttribute("student") Student theStudent )
	{
		//log the data inputed
		System.out.println(theStudent);
		
		
		return "student-registration-confirmation";
	}
	
	
	

}
