package com.pnc.iag.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;



@Controller
public class LinkController {

	@RequestMapping(path="/viewProfile",method=RequestMethod.GET)
	public String viewProfilePage(HttpServletRequest request, Model theModel) {
		
		return "view-profile";
	}
	
	@RequestMapping(path="/viewAuthcode",method=RequestMethod.GET)
	public String viewAuthcodePage(HttpServletRequest request, Model theModel) {
		
		return "view-authcode";
	}
}
