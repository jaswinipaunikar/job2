package com.manipal.DAO.jdbc;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.manipal.DAO.EmployeeDAO;
import com.manipal.model.Address;
import com.manipal.model.Employee;


		public class EmployeeDAOImp implements EmployeeDAO {
		

		@Override
		public int insertData(Employee emp, Address a) throws ClassNotFoundException,
				SQLException, IOException {
			
			String sql1 = "insert into address(address,city,state,country,zipcode) values(?,?,?,?,?)";
			
			String sql = "insert into employee(EMPLOYEE_USERNAME,EMPLOYEE_PASSWORD,EMPLOYEE_FIRST_NAME,EMPLOYEE_LAST_NAME"
					+ ",EMPLOYEE_DOB,EMPLOYEE_CONTACT,EMPLOYEE_EMAIL,ADDRESS_ID,EMPLOYEE_STATUS) "
					+ "values(?,?,?,?,?,?,?,?,?)";
			
			Connection con = ConnectionHelper.getMySqlConnection();
			PreparedStatement pst =  con.prepareStatement(sql);
			PreparedStatement pst1 =  con.prepareStatement(sql1);
			

			pst1.setString(1, a.getAddress());
			pst1.setString(2, a.getCity());	
			pst1.setString(3, a.getState());
			pst1.setString(4, a.getCountry());
			pst1.setString(5, a.getZipcode());
			int b= pst1.executeUpdate();
			System.out.println(" emp ADDED INTO ADDRESS TABLE");
			pst.setString(1, emp.getEmployee_Username());
			pst.setString(2, emp.getEmployee_Password());
			pst.setString(3, emp.getEmployee_First_Name());
			pst.setString(4, emp.getEmployee_Last_Name());
			pst.setString(5, emp.getEmployee_Date_Of_Birth());
			pst.setString(6, emp.getEmployee_Contact_No());
			pst.setString(7, emp.getEmployee_Email());
			pst.setInt(8, Statement.RETURN_GENERATED_KEYS);
			pst.setString(9, "active");
		
			
			

			
			int i= pst.executeUpdate();
			System.out.println("ADDED INTO EMPLOYEE TABLE");
			return i;
		}
		
		
/*
	@Override
		public int updateData(Employee emp,Address a) throws ClassNotFoundException,
				SQLException, IOException {
			String sql1 = "update address set address=?,city=?,state=?,country=?,zipcode=? where address_id=?";
			String sql = "update employee set employee_Username=?,employee_Password=?,employee_First_Name=?,employee_Last_Name=?,employee_DOB=?,employee_Contact=?, employee_Email=? where employee_Id= ?";
			Connection con = ConnectionHelper.getMySqlConnection();
			PreparedStatement pst =  con.prepareStatement(sql);
			PreparedStatement pst1 =  con.prepareStatement(sql1);
			
			pst1.setString(1, a.getAddress());
			pst1.setString(2, a.getAddress_City());	
			pst1.setString(3, a.getAddress_State());
			pst1.setString(4, a.getAddress_Country());
			pst1.setLong(5, a.getAddress_Zipcode());
			pst1.setString(6, a.getAddress_Id());
			int b= pst1.executeUpdate();
			System.out.println("update INTO ADDRESS TABLE");
			pst.setString(1, emp.getEmployee_Username());
			pst.setString(2, emp.getEmployee_Password());
			pst.setString(3, emp.getEmployee_First_Name());
			pst.setString(4, emp.getEmployee_Last_Name());
			pst.setString(5, emp.getEmployee_Date_Of_Birth());
			pst.setString(6, emp.getEmployee_Contact_No());
			pst.setString(7, emp.getEmployee_Email());
			pst.setString(8, "enable");
			pst.setString(8,emp.getEmployee_Id());
			
			
			int i= pst.executeUpdate();
			System.out.println(i);
			System.out.println("updated INTO EMPLOYEE TABLE");
			return i;
		}
		}
			*/
			

				ConnectionHelper conHelp=new ConnectionHelper();
				Connection con = null;
				Statement stmt;
				ResultSet rs;
				public List<Employee> viewlist(){
					
					List<Employee> ordList =new ArrayList<Employee>();
					
					try {
						con=ConnectionHelper.getMySqlConnection();
						  
						stmt = (Statement) con.createStatement();
						System.out.println(stmt);
						rs = stmt.executeQuery("select * from Employee where employee_status='active'");
						
						while (rs.next()) {
						
							Employee emp1=new Employee();
							emp1.setEmployee_Id(rs.getString(1));
							emp1.setEmployee_Username(rs.getString(2));
							emp1.setEmployee_Password(rs.getString(3));
							
							emp1.setEmployee_First_Name(rs.getString(4));
							emp1.setEmployee_Last_Name(rs.getString(5));
							emp1.setEmployee_Date_Of_Birth(rs.getString(6));
							emp1.setEmployee_Contact_No(rs.getString(7));
							emp1.setEmployee_Email(rs.getString(8));
							emp1.setEmployee_Address_Id(rs.getString(9));
							emp1.setEmployee_Status(rs.getString(10));
							System.out.println(emp1);
							ordList.add(emp1);
							
			}
			con.close();//return ordList;
						
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
					
					return ordList;
				}

				@Override
				public List<Address> viewlist1()
				{
					List<Address> ordList =new ArrayList<Address>();
					try {
						con=ConnectionHelper.getMySqlConnection();

						stmt = (Statement) con.createStatement();
						System.out.println(stmt);
						//result = stmt.executeQuery("select * from address");
						//rs = stmt.executeQuery("select * from address where address_id IN (select address_id from employee where employee_status='active' )");
						rs = stmt.executeQuery("select *  from employee where employee_status='active'");

						System.out.println("");

						while (rs.next()) 
						{


							Address rd = new Address();
							rd.setAddress(rs.getString(2));
							rd.setAddress_Id(rs.getString(1));
							rd.setCity(rs.getString(3));
							rd.setState(rs.getString(4));
							rd.setCountry(rs.getString(5));

							rd.setZipcode(rs.getString(6));
							rd.setStatus(rs.getString(7));

							System.out.println(rd);
							ordList.add(rd);
							
						}
						con.close();//return ordList;


					} 
					catch (ClassNotFoundException e)
					{
						// TODO Auto-generated catch block
						e.printStackTrace();
					} catch (SQLException e) 
					{
						// TODO Auto-generated catch block
						e.printStackTrace();
					} catch (IOException e) 
					{
						// TODO Auto-generated catch block
						e.printStackTrace();
					}


					return ordList;



		}
		
		

	
			
			
			
		
		
		
		/*@Override
		public String update(String room_type_id,String hotel_id,int no_of_rooms,double room_price,String status) {
			// TODO Auto-generated method stub
			DAOImpl cdj=new DAOImpl();
			
			cdj.update(hotel_id, room_type_id);
			return "";
		}
		
		*/
	
		
		
		
		
		
		
	/*	@Override
		public void updateEmployeeDetails( String employee_Id, String employee_Username,String employee_Password,String employee_First_Name,String employee_Last_Name, String employee_Date_Of_Birth,String employee_Email,String employee_Contact_No) {
			// TODO Auto-generated method stub
			Room_Details r=new Room_Details();
			r.setRoom_type_id(room_type_id);
			r.setHotel_id(hotel_id);
			r.setNo_of_rooms(no_of_rooms);
			r.setRoom_price(room_price);
			
			dao.update1(r);
		}
		
		
		
		
		@Override
		public String editEmployeeDetails(String employee_id, String hotel_id) {
			// TODO Auto-generated method stub
			DAOImpl cdj=new DAOImpl();
			
			cdj.updateRoomDetails(room_type_id,hotel_id);
			return "";	
			}
		
		
		}*/

			
			
			
			
			
			
			
			
			
	



		@Override
		public int deleteData(String emp_Id) throws ClassNotFoundException,
				SQLException, IOException {
			int rss=0;
			
				//String str =  "update Employee set employee_status='inactive' where Employee_Id="+emp_Id;
			System.out.println("id:"+emp_Id);
				String str = "update Employee set Employee_status='inactive' where Employee_ID=? ";
				
				
				//	String str1 =  "update address set status='inactive' where address_Id=(select address_id from employee where employee_id="+emp_Id+")";
				Connection con = ConnectionHelper.getMySqlConnection();
				//Statement ps=con.createStatement();
				PreparedStatement pst=con.prepareStatement(str);
				//pst.setString(1,"Inactive");
				pst.setString(1,emp_Id);
				rss= pst.executeUpdate();
				//	i= ps.executeUpdate(str1);
				System.out.println(rss);
				//rss=pst.executeUpdate();
				//System.out.println(rs);
		if(rss==1)
		{
			System.out.println("record deleted!!!");
		
		}
			
			return rss;
		}
		}
		
	

	

