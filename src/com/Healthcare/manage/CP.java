package com.Healthcare.manage;

import java.sql.Connection;
import java.sql.DriverManager;

public class CP {
	
	static Connection con;

	
	public static Connection createC() {
		try {
			//load the driver
			Class.forName("com.mysql.cj.jdbc.Driver");
		
			//create the connection...
			String user= "root";
			String password = "Abhay@#123";
			String url = "jdbc:mysql://localhost:3306/HEALTH_CARE?user=root&password=Pass&useUnicode=true&characterEncoding=UTF-8";
			
			con = DriverManager.getConnection(url, user, password);
			
		} catch (Exception e) {
	
		
        e.printStackTrace();
		}
		
		return con;
	}
}
