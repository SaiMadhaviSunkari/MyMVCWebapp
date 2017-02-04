package com.myfirstWebServices.Practice2;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
//import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.ui.Model;
//import javax.validation.Valid;
/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	

	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home() {
		return "home";
	}
	@RequestMapping(value = "/home", method = RequestMethod.GET)
	public String openhome() {
		return "home";
	}
	@RequestMapping(value = "/homeAfterRegisterentry", method = RequestMethod.POST)
	public String openhomeAgain(@RequestParam("name") String name,@RequestParam("email") String email,@RequestParam("username") String uname,@RequestParam("password") String pwd, @RequestParam("confirm") String con,Model model) {
		
		/*if(name.isEmpty()||uname.isEmpty()||pwd.isEmpty()||email.isEmpty()||con.isEmpty())
		{
		    if(name.isEmpty()&&uname.isEmpty()&&pwd.isEmpty()&&email.isEmpty()&&con.isEmpty())
				model.addAttribute("errorMsg", "all are empty is empty");
			else 
				{
				if(name.isEmpty())
				
			model.addAttribute("nameerrorMsg", "name is empty");
			if(uname.isEmpty())
				model.addAttribute("unameerrorMsg", "username is empty");
			if(pwd.isEmpty())
				model.addAttribute("pwderrorMsg", "pwd is empty");
			if(email.isEmpty())
				model.addAttribute("emailerrorMsg", "email is empty");
			if(con.isEmpty())
				model.addAttribute("conerrorMsg", "con is empty");
				}
			
		
		return "Register";
		}
		else
	    return "Loginwith";*/
		
		return "Loginwith";
		
	}
	@RequestMapping(value = "/Register", method = RequestMethod.GET)
	public String register() {
		return "Register";
	}
	@RequestMapping(value = "/Login", method = RequestMethod.GET)
	public String login() {
		return "Loginwith";
	}
	
	
	
}
