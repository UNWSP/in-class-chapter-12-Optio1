package pack;

public class GoTooFar {

	public static void main(String[] args) {
		int[] integers = {1,2,3,4,5};
		try {
			for (int i=0; i < 100000; i++ ) {
				System.out.println(integers[i]);
			}
		}
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Now you've gone too far!!!!!");
		}

	}

}
