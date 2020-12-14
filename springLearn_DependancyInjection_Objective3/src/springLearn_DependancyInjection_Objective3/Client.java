package springLearn_DependancyInjection_Objective3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

	public static void main(String[] args) {
		
	/*	Student student= new Student();
		MathCheat cheat = new MathCheat();
		student.setX(cheat);				// we can  notice from this line that student calss is "dependance on " cheat class
			student.cheating();*/
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		
		Student x= context.getBean("stu", Student.class);
		x.cheating();
		
		AnotherStudent x2 = context.getBean("anotherName", AnotherStudent.class);
		x2.startCheating();

	}

}
