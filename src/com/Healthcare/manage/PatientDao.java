package com.Healthcare.manage;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class PatientDao {

	public static boolean insertpatientToDB(Healthcare st) {
		
		boolean f = false;
		
		try {
			
			//JDBC Code creating connection and writing query
			
			Connection con=CP.createC();
			String q= "insert into PATIENT(sname,sphone,sage,scity)values(?,?,?,?)";
			
			
			//prepareStatement
			
			PreparedStatement hc = con.prepareStatement(q);
			
			// set the value of parameter
			
			hc.setString(1,st.getPatientName());
			hc.setString(2,st.getPatientPhone());
			hc.setString(3, st.getPatientAge());
			hc.setString(4,st.getPatientCity());
			
			//execute...
			
			hc.executeUpdate();
			f=true;
			
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
		return f;
		
	}

	public static boolean deletePatient(int patientId) {
		
		boolean f = false;
		
		try {
			
			//JDBC Code
			
			Connection con=CP.createC();
			String q= "Delete from PATIENT where sid=?";
			
			//prepareStatement
			
			PreparedStatement hc = con.prepareStatement(q);
			
			// set the value of parameter
			
			hc.setInt(1,patientId);
			
			
			//execute...
			
			hc.executeUpdate();
			f=true;
			
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
		return f;
	}

	public static boolean showAllPatient() {
		
		boolean f = false;
		
		try {
			
			//JDBC Code
			
			Connection con=CP.createC();
			String q= "select * from PATIENT";
			
			// create statement to send SQL query
			
			Statement hc = con.createStatement();
			ResultSet set = hc.executeQuery(q);

			while(set.next())
			{
				int id = set.getInt(1);
				String name = set.getString(2);
				String age = set.getString(3);
				String phone = set.getString(4);
				String city = set.getString(5);
				
				System.out.println("ID : "+ id);
				System.out.println("Name : "+ name);
				System.out.println("Age : "+ age);
				System.out.println("Phone : "+ phone);
				System.out.println("City : "+ city);
				System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++");
				
			}
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
		return f;
		
		
	}
}
