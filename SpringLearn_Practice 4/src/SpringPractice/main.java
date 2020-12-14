package SpringPractice;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class main {

	public static void main(String[] args) {
		/*AB test= new A();
		test.speak();*/
		/**
		 * modify x=  new modify;
		 * x.setAB( ab x);
		 * x.speak
		 * 
		 */
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		
		/*AB test = context.getBean("test", AB.class);
		test.speak();*/
		modify ab = context.getBean("test", modify.class);
				ab.speak();
		

	}

}
