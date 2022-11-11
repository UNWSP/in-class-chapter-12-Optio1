package pack;

public class DualTryCatch {

	public static void main(String[] args) {
		try {
			
			int number = 1;
			if (number == 1) {
				int[] integers = {1,2,3,4,5};
				for (int i=0; i < 100000; i++ ) {
					System.out.println(integers[i]);
				}
			}
			else {
				String numbers = "ABCD";
				Integer.parseInt(numbers);
			}
		}
		catch (NumberFormatException e) {
			System.out.println("Thats not a number.");
		}
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Array out of bounds.");
		}
		finally {
			System.out.println("This is the end!");
		}
	}

}
