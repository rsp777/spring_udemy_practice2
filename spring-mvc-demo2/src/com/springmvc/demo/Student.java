package com.springmvc.demo;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

public class Student {
	private String firstName;
	private String lastName;
	private String country;
	private  String favouriteLanguage;
//	private String os;
	private String[] os;
	private LinkedHashMap<String,String> countryOptions;
	
//	  private List<String> favoriteLanguageOptions;
	
	public Student() {
		// populate country options: used ISO code
		countryOptions = new LinkedHashMap<>();
		
		countryOptions.put("BRZ", "Brazil");
		countryOptions.put("FR", "France");
		countryOptions.put("SL", "Sri Lanka");
		countryOptions.put("IND", "India");
		
//		
//		 favoriteLanguageOptions = new ArrayList<>();
//		  favoriteLanguageOptions.add("Java");
//	        favoriteLanguageOptions.add("C#");
//	        favoriteLanguageOptions.add("PHP");
//	        favoriteLanguageOptions.add("Ruby");   
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

	public String getFavouriteLanguage() {
		return favouriteLanguage;
	}

	public void setFavouriteLanguage(String favouriteLanguage) {
		this.favouriteLanguage = favouriteLanguage;
	}

	public String[] getOs() {
		return os;
	}

	public void setOs(String[] os) {
		this.os = os;
	}

//	public List<String> getFavoriteLanguageOptions() {
//		return favoriteLanguageOptions;
//	}

//	public String getOs() {
//		return os;
//	}
//
//	public void setOs(String os) {
//		this.os = os;
//	}

//	public void setFavoriteLanguageOptions(LinkedHashMap<String, String> favoriteLanguageOptions) {
//		this.favoriteLanguageOptions = favoriteLanguageOptions;
//	}
	
	
	
	
	
}
