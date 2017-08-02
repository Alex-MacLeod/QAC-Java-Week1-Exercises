package exercises;

public class NTwice {
	public String nTwice(String input, int n) {
		String output = input.substring(0, n) + input.substring(input.length()-n, input.length());
		return output;
	}
}
