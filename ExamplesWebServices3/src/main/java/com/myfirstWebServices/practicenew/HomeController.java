package com.myfirstWebServices.practicenew;


import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Handles requests for the application home page.
 */
//import org.springframework.validation.BindingResult;

//import org.springframework.web.bind.annotation.RequestParam;

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
	
	
	
	
	
}
