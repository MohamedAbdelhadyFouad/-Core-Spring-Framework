	package indpendancyInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Exam {
		public static void main(String[] args) {
			
			
			/*Student student =new Student();
			student.setStudentName("Mohamed Abdelhady"); // this means, you have injected the name "Mohamed Abdelhady" to the value in the class Student
			
			student.displayStudentInfo();*/
			/**
			 *** Actually, Since we are learning spring we do not need to do all steps above, becasue simply Spring Framework
			 * do all these for us, by usnig setter and getter  functions 
			 * 
			 *** we  should do the following 
			 * 
			 */
			
			/*ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml"); // read the xml file, and creat the beans inside
			Student x= context.getBean("student",Student.class); // get the opject student which you have assign in the xml file
			x.displayStudentInfo();
			Student x2= context.getBean("student1",Student.class);
			x2.displayStudentInfo();*/
			
			/**
			 * in the above code , is how to set varibles by using setter functions,
			 ** in the following code is setting  student valuse using constractor 
			 *
			 */

			ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml"); 
			Student x2= context.getBean("student1",Student.class);
			x2.displayStudentInfo();
		}
	
	}
