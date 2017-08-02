package com.manipal.DAO.jdbc;

import static com.manipal.DAO.jdbc.ConnectionHelper.cleanup;
import static com.manipal.DAO.jdbc.ConnectionHelper.getMySqlConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.manipal.DAO.PaymentDAO;
import com.manipal.model.Payment;

public class PaymentDAOImpl implements PaymentDAO
{

	@Override
	public String validateAccount(String cardNumber, String expiry,
			String cvv, double amount) {
		
		System.out.println("In Payment Section");
		Connection con = null;
		PreparedStatement pst = null;
		ResultSet rs = null;
		ResultSet rs2=null;
		long value = 0;

		try {
			con = getMySqlConnection();
			String query = "SELECT * FROM CARD_DETAILS WHERE CARD_NUMBER=? AND CVV=?";
			pst = con.prepareStatement(query);
			
			pst.setString(1, cardNumber);
			pst.setString(2, cvv);
			
			rs = pst.executeQuery();
			while(rs.next())
			{
				if(rs.getDouble("BALANCE")>=amount)
				{
					double remain = (rs.getDouble("BALANCE")-amount);
					System.out.println(remain);
					String subQuery = "UPDATE CARD_DETAILS SET BALANCE=? WHERE CARD_NUMBER=?";
					pst = con.prepareStatement(subQuery);
					pst.setDouble(1, remain);
					pst.setString(2, rs.getString("CARD_NUMBER"));	
					pst.executeUpdate();
					con.commit();
					return "Payment Done Successfully";
				}
				else 
				{
					return "You have Insufficient Balance";
				}
			}
			return "You have Entered Wrong Details";

			

		} catch (Exception e) {
			/*LOGGER.debug(e.getMessage());*/
			throw new RuntimeException(e.getMessage());
		} finally {
			cleanup(con, pst, rs);
		}
	}

	}


