package com.letsee.changes.models;

import javax.validation.constraints.Size;
//import java.io.Serializable;
public class LoginModel{



@Size(max=15)
String userName;
String password;

public LoginModel()
{
	
}
public LoginModel(String userName, String password) {
	super();
	this.userName = userName;
	this.password = password;
}
public String getUserName() {
	return userName;
}
public void setUserName(String userName) {
	this.userName = userName;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}


}
