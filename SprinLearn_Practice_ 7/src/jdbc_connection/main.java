package jdbc_connection;

import java.sql.*;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class main {

	public static void main(String[] args) {
	/*	try {
			// get connection
			//Class.forName("com.mysql.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/data","root" ,"");

			System.out.println("good connection");
			
		}catch(Exception e) {
			
			System.out.println(e);
			
			
		}*/
		
		ApplicationContext x= new ClassPathXmlApplicationContext("tast.xml");
		System.out.println("Injection has been created");
		connectme y= x.getBean("testMe",connectme.class);
	y.Disply();
		y.testConnection();
		

	}

}
