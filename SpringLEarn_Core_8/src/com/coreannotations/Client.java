package com.coreannotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

	public static void main(String[] args) {
		
		//ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml"); we will use the following because we do not need to use beans.xml . we need to use th configuration class
		ApplicationContext context = new AnnotationConfigApplicationContext(CollegeConfig.class);
		College x= context.getBean("college", College.class);
		x.test();
		((AnnotationConfigApplicationContext) context).close(); // this just to close the context, it you delete it. it will not make problem

	}

}
