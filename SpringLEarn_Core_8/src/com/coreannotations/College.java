package com.coreannotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class College {
	//@Value("Dunaujvaros University")   // try to injct this value by proparty  file 
	@Value("${College.name}")
	private String CollageName;                          
	@Autowired
	private Principal principal;
	@Autowired
	@Qualifier("scienceTeacher")  // here we inject the ScineceTeacher calss. SINCE WE DID NOT GIVE IT A BEAN ID, THEN THE ID IS THE SAME NAME BUT SMALL BEGGINING
	private Teacher teacher;
	// we will do Injection using constractor
	/*
	 * public College(Principal principal) {
	 * 
	 * this.principal = principal; }
	 */


/*@Autowired
	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}

	// injection by setter methods
@Autowired
	public void setPrincipal(Principal principal) {
		this.principal = principal;
		System.out.println("This has been injected by using principle method");
	}*/

	public void test() {
		System.out.println("testing method");
		teacher.teach();
		System.out.println("My college name is : " + this.CollageName);
		principal.principalInfo();

	}

}
