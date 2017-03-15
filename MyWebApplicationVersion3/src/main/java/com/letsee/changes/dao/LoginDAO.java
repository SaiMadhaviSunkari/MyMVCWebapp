package com.letsee.changes.dao;


import com.letsee.changes.models.LoginModel;
import com.letsee.changes.models.RegisterModel;

public interface LoginDAO {
public String isValidUser(LoginModel login);
public boolean addNewUser(RegisterModel register);
}
