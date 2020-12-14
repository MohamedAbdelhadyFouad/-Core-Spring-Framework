package ProblemSolving;

public class Practice_Problems {

	public Practice_Problems(int x) {

		pattern(x);
	}

	public void pattern(int x) {
		System.out.println("You have entred : " + x );
		for (int i = 0; i < x; i++) {
			for (int j = 0; j <=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for (int i = 0; i < x; i++) {
			for (int j = 1; j <x-i ; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
