package com.letsee.changes;
//import java.sql.DriverManager;
//import java.sql.ResultSet;
//import java.sql.SQLException;
//import java.sql.Statement;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.letsee.changes.dao.LoginDAO;
import com.letsee.changes.models.LoginModel;

//import java.sql.Connection;


@Controller
public class LoginController {
	
	@Autowired
	LoginDAO loginDAO;
	
	@RequestMapping(value = "/Login", method = RequestMethod.GET)
	public String login(Model model) {
		model.addAttribute("Login-g", new LoginModel());
		return "Loginwith";
	}
	@RequestMapping(value = "/homeAfterlogin", method = RequestMethod.POST)
	public String Duringlogin(@Valid @ModelAttribute("Login-g") LoginModel loginto,BindingResult bindingresults, Model model) {
		if(bindingresults.hasErrors()){
			return "Loginwith";
		}
		
	String result= loginDAO.isValidUser(loginto);
	if(result.equals("valid"))	
	return "home";
	else if(result.equals("invalid"))
	{
		model.addAttribute("errorMsg", "Invalid Credentials");
		return "Loginwith";
	}
	else if(result.equals("DB ERROR"))
	{
		model.addAttribute("errorMsg", "DBConnectionerror");
		return "Loginwith";
	}
	else
	{
		model.addAttribute("errorMsg", "Sorry! please contact Admin");
	return "Loginwith";	
 }
}
}
