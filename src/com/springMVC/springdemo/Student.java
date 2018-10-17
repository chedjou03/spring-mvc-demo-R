package com.springMVC.springdemo;

import java.util.LinkedHashMap;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Student {
	
	private String firstName;
	
	@NotNull(message = "Last Name should not be empty")
	@Size(min = 1,message = "Last Name too long" )
	private String lastName;
	
	private String country;
	
	private String favoriteLanguage;
	
	private String operatingSystem;
	
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

	@Override
	public String toString() {
		return "Student [firstName=" + firstName + ", lastName=" + lastName + ", country=" + country
				+ ", favoriteLanguage=" + favoriteLanguage + ", operatingSystem=" + operatingSystem + "]";
	}

	
	
	
	
	
	

}
