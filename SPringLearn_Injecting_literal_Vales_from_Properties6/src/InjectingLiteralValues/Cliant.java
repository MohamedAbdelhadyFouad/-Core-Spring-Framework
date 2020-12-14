package InjectingLiteralValues;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Cliant {

	public static void main(String[] args) {
		ApplicationContext context= new ClassPathXmlApplicationContext("beans.xml");
		
		Student x = context.getBean("student", Student.class);
		x.dsiplyStudentInfo();
		

	}

}
