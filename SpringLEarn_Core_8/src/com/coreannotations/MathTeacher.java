package com.coreannotations;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
//@Primary                 //this means this class will be injected in case of two classes implements the one interface Teacher
public class MathTeacher implements Teacher {

	@Override
	public void teach() {
		System.out.println("I am Your Math Teacher !!");
	

	}

}
