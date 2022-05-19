package com.mindgate.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class EmployeeCRUDMain {

	public static void main(String[] args) {
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "system";
		String password = "mindgate123";
		String driver = "oracle.jdbc.driver.OracleDriver";

		int resultCount = 0;
		String sqlQuery = "";

		Connection connection;
	//	Statement statement;
		PreparedStatement preparedStatement;
		ResultSet resulSet;
		
		try {
			Class.forName(driver);
			connection= DriverManager.getConnection(url, user, password);
			sqlQuery="SELECT * FROM employee_details";
			preparedStatement= connection.prepareStatement(sqlQuery);
			
			resulSet=preparedStatement.executeQuery();
			while (resulSet.next()) {
				System.out.println(resulSet.getInt("employee_id"));
				System.out.println
				(resulSet.getString("name"));
				System.out.println(resulSet.getDouble("salary"));
				
				System.out.println("-".repeat(50));
			}
			connection.close();
		} catch (ClassNotFoundException | SQLException e) {
			System.out.println("Exception");
			System.out.println(e.getMessage());
		}
		
		
//		try {
//			Class.forName(driver);
//			connection = DriverManager.getConnection(url, user, password);
//			sqlQuery = "DELETE employee_details WHERE employee_id=?";
//			preparedStatement=connection.prepareStatement(sqlQuery);
//			preparedStatement.setInt(1, 5);
//			resultCount = preparedStatement.executeUpdate();
//			connection.close();
//			if (resultCount > 0) {
//				System.out.println("Deleted successfully");
//			} else {
//				System.out.println("Failed to delete");
//			}
//		} catch (ClassNotFoundException | SQLException e) {
//			System.out.println("Exception");
//			System.out.println(e.getMessage());
//		}

//		try {
//			Class.forName(driver);
//			connection=DriverManager.getConnection(url, user, password);
//			sqlQuery="UPDATE employee_details SET name=?, salary=? WHERE employee_id=?";
//			preparedStatement=connection.prepareStatement(sqlQuery);
//			preparedStatement.setString(1, "Rohit");
//			preparedStatement.setDouble(2, 10000);
//			preparedStatement.setInt(3, 5);
//			resultCount=preparedStatement.executeUpdate();
//			connection.close();
//			if (resultCount>0) {
//				System.out.println("Updated successfully");
//			}
//			else {
//				System.out.println("Failed to upload");
//			}
//		} catch (ClassNotFoundException | SQLException e) {
//			System.out.println("Exception");
//			System.out.println(e.getMessage());
//		}

//		System.out.println("Insert Example");
//		
//		try {
//			//To load Driver
//			Class.forName(driver);
//			//To connect DB
//			connection=DriverManager.getConnection(url, user, password);
//			//To write sql query
//			sqlQuery="INSERT INTO employee_details(name,salary) VALUES(?,?)";
//			//TO Create statement
//			preparedStatement =connection.prepareStatement(sqlQuery);
//		 preparedStatement.setString(1, "Chaitanya");
//		 preparedStatement.setDouble(2, 1000);
//		
//			resultCount=preparedStatement.executeUpdate();
//			connection.close();
//			if (resultCount>0) {
//				System.out.println("Record Inserted Successfully");
//			}
//			else {
//				System.out.println("Failed to insert");
//			}
//		} catch (ClassNotFoundException | SQLException e) {
//			System.out.println("Exception");
//			System.out.println(e.getMessage());
//		}

	}

}
