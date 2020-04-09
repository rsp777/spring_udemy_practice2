package com.springmvc.demo;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.xml.ws.RequestWrapper;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/funny")
public class HelloController {
	
	//Controller method to show HTML form
	@RequestMapping("/showForm")
	public String showForm() {
		return "helloworld-main";
	}
	
	//Controller method to process HTML form
	@RequestMapping("/processForm")
	public String processForm() {
		return "helloworld";
	}
	
//	@RequestMapping("/processFormVersion2")
//	public String letShout(HttpServletRequest request, Model model) {
//		String theName = request.getParameter("studentName");
//		
//		
//		theName = theName.toUpperCase();
//		String result = "Yo!! "+theName;
//		model.addAttribute("message",result);
//		
//		return "helloworld";
//		
//	}
	@RequestMapping("/processFormVersion2")
	public String letShout(@RequestParam("studentName") String theName, Model model) {
		theName = theName.toUpperCase();
		String result = "Yo!! "+theName;
		model.addAttribute("message",result);
		
		return "helloworld";
		
	}
}
