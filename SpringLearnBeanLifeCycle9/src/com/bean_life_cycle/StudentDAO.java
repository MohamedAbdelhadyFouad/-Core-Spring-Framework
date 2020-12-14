package com.bean_life_cycle;

import java.sql.*;

import javax.annotation.PreDestroy;

import org.springframework.web.bind.annotation.PostMapping;

public class StudentDAO {

	private String Driver;
	private String url;
	private String userName;
	private String password;
	Connection conn;
	
	public void init() throws SQLException {
		
		CreateStudentDBConnection();
		
	}
	public void CreateStudentDBConnection() throws SQLException {

		conn = DriverManager.getConnection(url, userName, password);

	}
	public void selectAllRows() throws SQLException {
		//CreateStudentDBConnection();
		
		Statement stmt = conn.createStatement();
		ResultSet re = stmt.executeQuery("SELECT * FROM hostel.hostelstudentinfo;");
		while (re.next()) {
			int studentId = re.getInt(1);
			String studentName = re.getString(2);
			int StudentFee = re.getInt(3);
			String foodType = re.getString(4);

			System.out.println(studentId + "  " + studentName + "  " + StudentFee + " " + foodType);
		}

	}

	public void DeleteRecord(int ID) throws SQLException {
		//CreateStudentDBConnection();
		Statement sttm = conn.createStatement();
		sttm.executeUpdate("delete FROM hostel.hostelstudentinfo where ID =" + ID);
		System.out.println("Record deleted with the id " + ID);

	}

	public void setDriver(String driver) {
		Driver = driver;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getDriver() {
		return Driver;
	}

	public String getUrl() {
		return url;
	}

	public String getUserName() {
		return userName;
	}

	public String getPassword() {
		return password;
	}
 
	public void closeConnection() throws SQLException {
		conn.close();

	}
 public void destroy() throws SQLException {
	 closeConnection();
	 
 }

}
