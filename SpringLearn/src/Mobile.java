import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class Mobile {
	public static void main(String[] args) {
	/*	BClass  Artil = new BClass();
		Artil.calling();
		Artil.data();
		BClass2 Vodafone = new BClass2();
		Vodafone.calling();
		Vodafone.data();*/
		
		/*AInterface x= new BClass2();
		x.calling();
		x.data();*/
		
		/*AInterface x= new BClass();
		x.calling();
		x.data();*/
		
		
	/**
	 * here the beginneing of spring framework
	 * 
	 * Ioc container, it has two interfaces. 
	 * (1) Bean factory -> its old version
	 * (2) ApplicationContext -> that one we will use. -> implements ClassPathXmlApplicationContext
	 * 
	 * The interface ApplicationContext -> it shoud read the config file (xml file).
	 * 
	 
	 */
		
		
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		/*System.out.println("config uploaded");
		BClass air= (BClass)context.getBean("bClass");*/
		/**
		 *  you can write it in this way , to avoid casting.
		 *  Bclass air= context.getBeans("bClass", Bclass.class)
		 */
		/*air.calling();
		air.data();
		BClass2 b2 = (BClass2) context.getBean("bClass2");
		b2.calling();
		b2.data();*/
		
		
		/**
		 * all the above is not the propar way, because we should use the Interfce "AInterface" to make objects from the classe
		 * 
		 * here is the propar way, whihc you can call any class form  the xml file, without touching the source code.   in the  main 
		 */
		AInterface x = context.getBean("aInterface", AInterface.class );
		x.calling();
		x.data();
		
	}

}
