package com.pnc.iag.controller;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.pnc.iag.entity.User;
import com.pnc.iag.service.UserService;

@Controller
@SessionAttributes("theUser")
public class LoginController {

	@Autowired
	private UserService userService;
	
	/*@RequestMapping("/")
	public String showLoginPage(Model theModel) {
		LoginBean loginBean = new LoginBean();
		theModel.addAttribute("loginBean", loginBean);
		return "login";
	}*/
	
	@RequestMapping(path="/",method=RequestMethod.GET)
	public String showLoginPage(Model theModel) {
		User user = new User();
		theModel.addAttribute("theUser",user);
		return "login";
	}
	
	@RequestMapping(path="/processLogin",method=RequestMethod.POST)
	public String processLogin(Model model, @ModelAttribute("theUser")User theUser, HttpServletRequest request) {
		
		String returnPage = "main-menu";
		User checkedUser = userService.getUser(theUser.getUserID());

		if(null == checkedUser) {
			model.addAttribute("message","User Not Found");
			returnPage = "login";
			
		}
		
		else if(theUser.getUserPassword().equals(checkedUser.getUserPassword())) 
		{
				System.out.println("The password is " + checkedUser.getUserPassword());
				theUser = checkedUser;
				model.addAttribute("theUser",theUser);
				System.out.println(theUser);
				
		}
		else
		{
			model.addAttribute("message","Invalid Login Credentials");
			returnPage = "login";	
		}
		
		
		
		return returnPage;
	}
	
	
}
