package com.manipal.service;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import com.manipal.model.*;

public interface LoginService {
	public int checkLogin();
	public List<Customer> validates() throws ClassNotFoundException, SQLException, IOException;
}