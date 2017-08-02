package com.manipal.DAO;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import com.manipal.model.*;

public interface LoginDAO {
	public String check();
	public List<Customer> validate()throws ClassNotFoundException, SQLException, IOException;
}
