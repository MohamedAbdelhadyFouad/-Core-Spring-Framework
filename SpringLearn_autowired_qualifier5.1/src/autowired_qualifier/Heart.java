package autowired_qualifier;

public class Heart {
	private int noOfAnimal;
	private String nameOfAnimal;
	
	
	public int getNoOfAnimal() {
		return noOfAnimal;
	}


	public String getNameOfAnimal() {
		return nameOfAnimal;
	}


	public void setNoOfAnimal(int noOfAnimal) {
		this.noOfAnimal = noOfAnimal;
	}


	public void setNameOfAnimal(String nameOfAnimal) {
		this.nameOfAnimal = nameOfAnimal;
	}


	public void pump()
	{
		System.out.println("your heart is pumping");
		System.out.println("Alive");
		
	}

}
