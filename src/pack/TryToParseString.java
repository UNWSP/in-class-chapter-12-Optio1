package pack;

public class TryToParseString {

	public static void main(String[] args) {
		try {
			String a = "abcd";
			Integer.parseInt(a);
		}
		catch (NumberFormatException e) {
			System.out.print("Thats not an integer.");
		}

	}

}
