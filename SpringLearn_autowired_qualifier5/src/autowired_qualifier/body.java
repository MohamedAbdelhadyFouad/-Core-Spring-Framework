package autowired_qualifier;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class body {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context =  new ClassPathXmlApplicationContext("beans.xml");
		
		Human human= context.getBean("human", Human.class);
		human.startPumping();
		
	}

}
