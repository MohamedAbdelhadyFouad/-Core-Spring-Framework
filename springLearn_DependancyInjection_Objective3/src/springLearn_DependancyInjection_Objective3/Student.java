package springLearn_DependancyInjection_Objective3;

public class Student {
	
  private  int id; 
	private MathCheat x;

	public void setId(int id) {
		this.id = id;
	}

	public void setX(MathCheat x) {
		this.x = x;
	}

	public void cheating() {

		x.mathCheat();
		System.out.println("my id is "+ id);
	}

	public int getId() {
		return id;
	}

}
