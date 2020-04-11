package com.springmvc.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/student")
public class StudentController {
	
	@RequestMapping("/showForm")
	public String showForm( Model theModel) {
//		@ModelAttribute("student") Student theStudent,
		Student theStudent = new Student();
		theModel.addAttribute("student", theStudent);
		return "student_form";
	}
	
	@RequestMapping("/processForm")
	public String processForm(@ModelAttribute("student") Student theStudent,Model theModel) {
//		theModel.addAttribute("student", new Student());
		
		System.out.println("theStudent: "+theStudent.getFirstName()+" "+theStudent.getLastName());
		System.out.println("Country : "+theStudent.getCountry());
		System.out.println(theStudent.getFavouriteLanguage());
		return "student_confirmation";
	}
}
