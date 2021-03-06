package com.springMVC.springdemo;

import java.util.LinkedHashMap;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import com.springMVC.validation.CourseCode;

public class Student {
	
	private String firstName;
	
	
	@NotNull(message = "Last Name should not be empty")
	@Size(min = 1,message = "Last Name too long" )
	private String lastName;
	
	
	private String country;
	
	private String sport;
	
	
	private String favoriteLanguage;
	
	
	private String operatingSystem;
	
	@NotNull(message = "Is required ")
	@CourseCode
	private String courseCode;
	
	
	@NotNull(message = "is required")
	@Min (value = 0, message = "must be greater or equal to zero")
	@Max (value = 10, message = "must be less than or equal to 10")
	private Integer freePasses;
	
	
	@Pattern(regexp = "^[a-zA-Z0-9]{5}", message = "only 5 chars/digits")
	private String postalCode;
	
	
	private LinkedHashMap<String,String> countryOptions;
	
	
	private LinkedHashMap <String, String> favoriteLanguageOptions;
	
	
	private LinkedHashMap <String, String> operatingSystemsOptions;
	
	
	public  Student() {
		//populate country option
		countryOptions = new LinkedHashMap<>();
		countryOptions.put("FR", "France");
		countryOptions.put("USA", "United State of America");
		countryOptions.put("CRM", "Cameroon");
		countryOptions.put("NGR", "Nigeria");
		countryOptions.put("BRZ", "Brazil");
		countryOptions.put("CND", "Canada");
		countryOptions.put("GMY", "Germany");
		
		//populate language options
		favoriteLanguageOptions = new LinkedHashMap<>();
		favoriteLanguageOptions.put("Java", "Java");
		favoriteLanguageOptions.put("C#", "C#");
		favoriteLanguageOptions.put("Pytnon", "Python");
		favoriteLanguageOptions.put("Pascal", "Pascal");
		favoriteLanguageOptions.put("C++", "C++");
		
		//populate operating systems options
		operatingSystemsOptions = new LinkedHashMap<>();
		operatingSystemsOptions.put("Windows", "Windows OS");
		operatingSystemsOptions.put("Linux", "Linux OS");
		operatingSystemsOptions.put("MAC", "MAC OS");
		operatingSystemsOptions.put("ANDROID", "ANDROID");
	}
	

	public String getFirstName() {
		return firstName;
	}
	

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	

	public String getLastName() {
		return lastName;
	}
	

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	

	public String getCountry() {
		return country;
	}
	

	public void setCountry(String country) {
		this.country = country;
	}
	

	public LinkedHashMap<String, String> getCountryOptions() {
		return countryOptions;
	}
	
	
	public String getFavoriteLanguage() {
		return favoriteLanguage;
	}
	

	public void setFavoriteLanguage(String favoriteLanguage) {
		this.favoriteLanguage = favoriteLanguage;
	}
	

	public LinkedHashMap<String, String> getFavoriteLanguageOptions() {
		return favoriteLanguageOptions;
	}
	
	

	public String getOperatingSystem() {
		return operatingSystem;
	}
	

	public void setOperatingSystem(String operatingSystem) {
		this.operatingSystem = operatingSystem;
	}
	
	
	public LinkedHashMap<String, String> getOperatingSystemsOptions() {
		return operatingSystemsOptions;
	}

	
	public Integer getFreePasses() {
		return freePasses;
	}
	

	public void setFreePasses(Integer freePasses) {
		this.freePasses = freePasses;
	}
	

	public String getPostalCode() {
		return postalCode;
	}
	

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}
	
	
		

	public String getSport() {
		return sport;
	}


	public void setSport(String sport) {
		this.sport = sport;
	}

		

	public String getCourseCode() {
		return courseCode;
	}


	public void setCourseCode(String courseCode) {
		this.courseCode = courseCode;
	}


	
	@Override
	public String toString() {
		return "Student [firstName=" + firstName + ", lastName=" + lastName + ", country=" + country + ", sport="
				+ sport + ", favoriteLanguage=" + favoriteLanguage + ", operatingSystem=" + operatingSystem
				+ ", courseCode=" + courseCode + ", freePasses=" + freePasses + ", postalCode=" + postalCode + "]";
	}

}
