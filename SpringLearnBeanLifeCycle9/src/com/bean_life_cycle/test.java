package com.bean_life_cycle;

import java.sql.SQLException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {

	public static void main(String[] args) throws SQLException {
			/*StudentDAO student1= new StudentDAO();
			student1.selectAllRows();
			student1.DeleteRecord(4);
			student1.selectAllRows();*/
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		StudentDAO student1 = context.getBean("studentDAO",StudentDAO.class);
		student1.selectAllRows();
			
	}

}
