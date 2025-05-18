package jdbc;

import java.sql.*;
public class jdbc1 {

	public static void main(String[] args) {
		System.out.println("hai this is chaitanya");
		// TODO Auto-generated method stub
		 try {
	         // Step-1: Register the driver
	         Class.forName("com.mysql.cj.jdbc.Driver");

	         // Step-2: Get the connection
	         Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/school", "root", "root");

	         // Step-3: Create statement
	         Statement stmt = con.createStatement();

	         // Step-4: Execute the query
	         stmt.executeUpdate("insert into Student values(8, 'chaitanya', '5th')");

	         // Step-5: Close the connection  
	         con.close();
	      } catch (Exception ex) {
	         System.out.println(ex);
	      }


	}

}
