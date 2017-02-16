package com.myfirstWebServices.practicenew.Model;

public class RegisterModel {
 String name;
 String userName;
 String password;
 String confirm;
 String email;
 
 public RegisterModel()
 {
	 
 }

public RegisterModel(String name, String userName, String password, String confirm, String email) {
	super();
	this.name = name;
	this.userName = userName;
	this.password = password;
	this.confirm = confirm;
	this.email = email;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
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

public String getConfirm() {
	return confirm;
}

public void setConfirm(String confirm) {
	this.confirm = confirm;
}

public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}


 
}
