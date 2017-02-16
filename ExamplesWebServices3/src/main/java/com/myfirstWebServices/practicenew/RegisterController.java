package com.myfirstWebServices.practicenew;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
//import java.sql.ResultSet;
import java.sql.SQLException;
//import java.sql.Statement;

//import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
//import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.myfirstWebServices.practicenew.Model.LoginModel;
import com.myfirstWebServices.practicenew.Model.RegisterModel;

import org.springframework.web.bind.annotation.ModelAttribute;

@Controller
public class RegisterController {
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
		
		Connection con=null;
		try{
			Class.forName("com.mysql.jdbc.Driver");
			con= DriverManager.getConnection("jdbc:mysql://localhost:3306/myschema","root","madhavi@madhavi");
			String query="INSERT INTO detailscomicusers VALUES(?,?,?,?,?)";
			PreparedStatement pstmt=con.prepareStatement(query);
			pstmt.setString(1,register.getName());
			pstmt.setString(2,register.getEmail());
			pstmt.setString(3,register.getUserName());
			pstmt.setString(4,register.getPassword());
			pstmt.setString(5,register.getConfirm());
			
			int n=pstmt.executeUpdate();
			if(n==5)
			{
				return "home";
			}
			else 
			{
				model.addAttribute("errorMsg","something went wrong");
				return "Register";
			}
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		catch(ClassNotFoundException e)
		{
			e.printStackTrace();
		}
		finally{
			
		try
		{
			con.close();
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		}
		model.addAttribute("errorMsg","DB connection Error");
		//model.addAttribute("Login-g",new LoginModel());
		return "Register";
		
	}
}
