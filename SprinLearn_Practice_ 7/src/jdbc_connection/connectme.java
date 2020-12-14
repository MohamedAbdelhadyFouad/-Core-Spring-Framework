package jdbc_connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Value;

public class connectme {
	@Value("${connect.url}")
	private String url;
	@Value("${connect.user}")
	private String user;
	@Value("${connect.pass}") 
	private String password;
	
	public void Disply() {
		System.out.println(url+"\n"+user+"\n"+ password);		
	}

	public void testConnection() {

		try {		
			Connection conn = DriverManager.getConnection(url, user, password);
			System.out.println("Connection has been done perfectly");
		} catch (SQLException e) {
			System.out.println("There is Problem with the connection");
		}

	}

}
