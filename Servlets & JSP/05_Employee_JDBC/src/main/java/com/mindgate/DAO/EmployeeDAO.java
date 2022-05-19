package com.mindgate.DAO;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import com.mindgate.pojo.Employee;

public class EmployeeDAO {

	private String url = "jdbc:oracle:thin:@localhost:1521:xe";
	private String user = "system";
	private String password = "mindgate123";
	private String driver = "oracle.jdbc.driver.OracleDriver";
	private String query = "";
	private int resultCount = 0;

	private Connection connection;
	private PreparedStatement preparedStatement;
	private ResultSet resultSet;

	public List<Employee> getAllEmployee() {

		try {
			Class.forName(driver);
			connection = DriverManager.getConnection(url, user, password);
			query = "SELECT * FROM employee_details";
			preparedStatement = connection.prepareStatement(query);
			resultSet = preparedStatement.executeQuery();
			
			List<Employee> employeeList = new ArrayList<Employee>();
			
			while (resultSet.next()) {
				int employee_id = resultSet.getInt("employee_id");
				String name = resultSet.getString("name");
				double salary = resultSet.getDouble("salary");

				Employee employee = new Employee(employee_id, name, salary);

				employeeList.add(employee);
			}
			return employeeList;

		} catch (ClassNotFoundException | SQLException e) {
			System.out.println("Exception");
			System.out.println(e.getMessage());
		} finally {
			try {
				connection.close();
			} catch (SQLException e) {
				System.out.println("Exception");
				System.out.println(e.getMessage());
			}
		}
		return null;

	}

	public boolean addEmployeeem(Employee employee) {
		try {
			Class.forName(driver);
			connection = DriverManager.getConnection(url, user, password);
			query = "INSERT INTO employee_details(name,salary) VALUES(?,?) ";
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setString(1, employee.getName());
			preparedStatement.setDouble(2, employee.getSalary());

			resultCount = preparedStatement.executeUpdate();

			if (resultCount > 0) {
				return true;
			} else {
				return false;
			}

		} catch (ClassNotFoundException | SQLException e) {
			System.out.println("Exception");
			System.out.println(e.getMessage());
		} finally {
			try {
				connection.close();
			} catch (SQLException e) {
				System.out.println("Exception");
				System.out.println(e.getMessage());
			}
		}
		return false;

	}
}
