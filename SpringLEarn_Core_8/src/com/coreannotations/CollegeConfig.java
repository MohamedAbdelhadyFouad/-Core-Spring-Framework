package com.coreannotations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * This class we will use insted of the beans.xml file  
 *  this class is called configration class, where we will use 
 *  @configuration
 *  so from now the beans.xml is  not used
 * @author Mohamed Abdelhady
 *
 */
@Configuration
@ComponentScan(basePackages = "com.coreannotations")

@PropertySource("classpath:College-Info.Properties" )// to activate the college-Info Proparties calss you have to  use this annotation 

public class CollegeConfig {
	
	
	/**
	 * I comment this because I will use @autowired
	 * to make the configuration 
	 */
	
	/*@Bean
	public Teacher mathTeacherBean() {
		MathTeacher mathTeacher = new MathTeacher();
		
		return mathTeacher;
	}
	
	@Bean
	public Principal principalBean() {
		
		return new Principal();
	}
	
	@Bean
	public College collegeBean()  //collegeBean - bean-Id
	{
		College college = new College();
		
		college.setPrincipal(principalBean());
		college.setTeacher(mathTeacherBean());
		
		return college;	
		
	}*/
	

}
