package com.springMVC.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class CourseCodeConstraintValidator implements ConstraintValidator<CourseCode,String>{

	
	private String coursePrefix;
	
	@Override
	public void initialize(CourseCode theCourseCode)
	{
		coursePrefix = theCourseCode.value();
	}
	
	@Override
	public boolean isValid(String TheUserEnteredCode, ConstraintValidatorContext theConstraintValidatorContext) 
	{
		boolean result ;
		if(TheUserEnteredCode != null )
		{
			result = TheUserEnteredCode.startsWith(coursePrefix);
		}
		else 
		{
			result = false;
		}
		
		return  result; 
	}
	

}
