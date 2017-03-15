package com.letsee.changes;
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.PreparedStatement;
//import java.sql.ResultSet;
//import java.sql.SQLException;
//import java.sql.Statement;

import org.springframework.beans.factory.annotation.Autowired;

//import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
//import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.letsee.changes.dao.LoginDAO;
import com.letsee.changes.models.LoginModel;
import com.letsee.changes.models.RegisterModel;

import org.springframework.web.bind.annotation.ModelAttribute;

@Controller
public class RegisterController {
	
	@Autowired
	LoginDAO loginDAO;
	
	@RequestMapping(value = "/Register", method = RequestMethod.GET)
	public String openRegister(Model model) {	
		model.addAttribute("registering", new RegisterModel());
		return "Register";
	}
	
	
	@RequestMapping(value = "/homeAfterRegisterentry", method = RequestMethod.POST)
	public String openhomeAgain(/*@RequestParam("name") String name,@RequestParam("email") String email,@RequestParam("username") String uname,@RequestParam("password") String pwd, @RequestParam("confirm") String con,*/
      @ModelAttribute("registering") RegisterModel register, Model model) {
		/*int flag=0;
		if(name.isEmpty()||uname.isEmpty()||pwd.isEmpty()||email.isEmpty()||con.isEmpty())
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
			flag=0;
		}
		else 
			flag=1;
		/*return "Register";
		}
		else
	    return "Loginwith";*/
		
		Boolean result= loginDAO.addNewUser(register);
		if(result==true)
		{
			model.addAttribute("Login-g",new LoginModel());
			return "Loginwith";
		}
		else
		{
		model.addAttribute("errorMsg","something went terribly wrong with registering. Register again!");
		return "Register";
		}
	}
}
