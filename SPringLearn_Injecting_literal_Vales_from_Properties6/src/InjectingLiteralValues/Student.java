package InjectingLiteralValues;

import org.springframework.beans.factory.annotation.Required;
import org.springframework.beans.factory.annotation.Value;

public class Student {
	
	@Value("${student.name}")
	private String name;
	@Value("${student.IntrestedCourse}")
	private String IntrestedCourse;
	@Value("${student.hoppy}")
	private String hoppy;

	
	/**
	 * Since we are using the annotation  before the values then we do not need setter methods 
	 */
	/*
	 * @Value("${student.name}") public void setName(String name) { this.name =
	 * name; }
	 */

	/*
	 * @Required // this annotaion means you have to add this value. if you remove
	 * the value annotation is going to make problem
	 * 
	 * @Value("${student.IntrestedCourse}") public void setIntrestedCourse(String
	 * intrestedCourse) { IntrestedCourse = intrestedCourse; }
	 */

	/*
	 * @Value("${student.hoppy}") // use @value insted injection from xml file
	 * public void setHoppy(String hoppy) { this.hoppy = hoppy; }
	 */
	public void dsiplyStudentInfo() {
		
		System.out.println(name+"\n"+IntrestedCourse+"\n"+hoppy);
	}

}
