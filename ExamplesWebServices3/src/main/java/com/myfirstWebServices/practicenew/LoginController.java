package com.myfirstWebServices.practicenew;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.myfirstWebServices.practicenew.Model.LoginModel;

import java.sql.Connection;



@Controller
public class LoginController {
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
		Connection con=null;
		try{
			Class.forName("com.mysql.jdbc.Driver");
			con= DriverManager.getConnection("jdbc:mysql://localhost:3306/myschema","root","madhavi@madhavi");
			
			String query="select *from detailscomicusers where username='"+loginto.getUserName()+"' and password='"+loginto.getPassword()+"'";
			Statement stmt=con.createStatement();
			ResultSet rs=stmt.executeQuery(query);
			if(rs.next())
			{
				return "home";
			}
			else
			{
				model.addAttribute("errormsg","invalid credentials");
				model.addAttribute("Login-g", new LoginModel());
			    return "Loginwith";
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
		finally
		{
			try
			{
				con.close();
			}
			catch(SQLException e)
			{
				e.printStackTrace();
			}
		}
		//model.addAttribute("", new LoginModel());
		return "Loginwith";
	}
}
