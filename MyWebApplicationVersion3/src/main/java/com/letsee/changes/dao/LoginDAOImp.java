package com.letsee.changes.dao;

import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.PreparedStatement;
//import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

//import org.springframework.ui.Model;

import com.letsee.changes.models.LoginModel;
import com.letsee.changes.models.RegisterModel;

public class LoginDAOImp implements LoginDAO {

	
	DataSource datasource;
	JdbcTemplate jdbctemplate;
	public void setDatasource(DataSource datasource) {
		this.datasource = datasource;
	}


	@Override
	public String isValidUser(LoginModel login) {
		// TODO Auto-generated method stub
		Connection con=null;
		
		try{
			con=datasource.getConnection();
			String query="select *from detailscomicusers where username='"+login.getUserName()+"' and password='"+login.getPassword()+"'";
			Statement stmt=con.createStatement();
			ResultSet rs=stmt.executeQuery(query);
			if(rs.next())
			{
				return "valid";
			}
			else
				return "invalid";
		}
		catch(SQLException e)
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
		return "DB ERROR";
		
	
	}


	@Override
	public boolean addNewUser(RegisterModel register) {
		// TODO Auto-generated method stub
		jdbctemplate=new JdbcTemplate(datasource);
		//Connection con=null;
		//try{
			//con=datasource.getConnection();
			String query="INSERT INTO detailscomicusers VALUES(?,?,?,?,?)";
			/*PreparedStatement pstmt=con.prepareStatement(query);
			pstmt.setString(1,register.getName());
			pstmt.setString(2,register.getEmail());
			pstmt.setString(3,register.getUserName());
			pstmt.setString(4,register.getPassword());
			pstmt.setString(5,register.getConfirm());*/
			Object[] args={register.getName(), register.getEmail(), register.getUserName(),register.getPassword(),register.getConfirm()};
			
			//int n=pstmt.executeUpdate();	
			int n=jdbctemplate.update(query,args);
			if(n>0)
			{
				return true;
			}
			else
				return false;
		}
	}
