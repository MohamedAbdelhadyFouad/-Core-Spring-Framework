package autowired_qualifier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Human {
	@Autowired
	@Qualifier("dogheart") 
	private Heart heart;
	
	/*public Human() {
		System.out.println("first constructor has been called");
	}
	
	public Human(Heart heart) {
		System.out.println("Constructor has been called..");
		this.heart = heart;
	}
	
	
	public void setHeart(Heart heart) {
		System.out.println("setter method has been called..");
		this.heart = heart;

	}*/

	public void startPumping() {
		if(heart != null) {
		heart.pump();
		System.out.println("Heart name  is: "+ heart.getNameOfAnimal()+ "/n"+" heart no is : "+ heart.getNoOfAnimal());
		}else {
			System.out.println("you are dead!!");
		}
	}
}
