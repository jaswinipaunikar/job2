

package com.manipal.service.impl;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.manipal.DAO.EmployeeDAO;
import com.manipal.DAO.jdbc.EmployeeDAOImp;
import com.manipal.DAO.jdbc.ConnectionHelper;
//import com.manipal.DAO.jdbc.EmployeeDAOJDBC;
import com.manipal.model.Address;
import com.manipal.model.Employee;
import com.manipal.service.EmployeeService;


public class EmployeeServiceImp implements EmployeeService{
EmployeeDAOImp obj=new EmployeeDAOImp();
int ins,updt;


	EmployeeDAO sd = new EmployeeDAOImp();
	@Override
	public List<Employee> viewDatas() throws ClassNotFoundException, SQLException, IOException {
		List<Employee> st=sd.viewlist();
		return st ;
	}
	public List<Address> viewDatas1() {
		List<Address> dt=sd.viewlist1();
		return dt ;
	}


/*	@Override
	public String update(String room_type_id,String hotel_id,int no_of_rooms,double room_price,String status) {
		// TODO Auto-generated method stub
		EmployeeDAOImp cdj=new EmployeeDAOImp();
		
		cdj.update(hotel_id, room_type_id);
		return "";
	}
	
	*/
	
	
	
	
	
/*	
	@Override
	public void updateRoomDetails(String room_type_id, String hotel_id,				//1st update
			int no_of_rooms, double room_price) {
		// TODO Auto-generated method stub
		Room_Details r=new Room_Details();
		r.setRoom_type_id(room_type_id);
		r.setHotel_id(hotel_id);
		r.setNo_of_rooms(no_of_rooms);
		r.setRoom_price(room_price);
		
		dao.update1(r);
	}


*/



	@Override
	public int insertDatas(Employee emp, Address a) throws ClassNotFoundException,
			SQLException, IOException {
		return ins=obj.insertData(emp,a);
	}




	
	


	


@Override
public int deleteDatas(String emp_Id) {
	int c=0;
	// TODO Auto-generated method stub
	try {
		c=obj.deleteData(emp_Id);
		
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return c;
	
}
}



	



	
		





