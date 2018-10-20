package com.springMVC.springdemo;

import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/student")
public class StudentController 
{
	@Value("#{sportOptions}") 
	private Map<String, String> sportOptions;
	
	// add an inibinder ... to convert trimp inputs strings
	// remove leading and trailing whitespace from any string input
	 @InitBinder
	 public void initBinder ( WebDataBinder binder )
	 {
		 StringTrimmerEditor stringtrimmer = new StringTrimmerEditor(true);
		 binder.registerCustomEditor(String.class, stringtrimmer);
	 }
	 
	
	@RequestMapping("/showStudentRegistrationForm")
	public String showForm(Model theModel) 
	{
		
		// create a new student object
		Student theStudent = new Student();
		
		//add the sportOptions to the model
		theModel.addAttribute("theSportOptions", sportOptions);
		
		//add student to model as model attribute
		theModel.addAttribute("student",theStudent);
		
		return "student-registration-form";
	}
	
	
	
	@RequestMapping("/processStudentRegistrationForm")
	public String processStudentRegistrationForm(	@Valid @ModelAttribute("student") Student theStudent, 
													BindingResult theBindingResult )
	{
		if(theBindingResult.hasErrors())
		{
			return "student-registration-form";	
		}
		else 
		{
			//log the data inputed
			System.out.println(theStudent);
			return "student-registration-confirmation";
		}	
		
	}
	
}
