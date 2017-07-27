package offlineExercises;

public class DoubleChar {
	public String doubleChar(String input) {
		char[] charArray = input.toCharArray();
		char[] doubleChars = new char[2*charArray.length];
		for (int c=0; c < charArray.length; c++) {
			doubleChars[2*c] = (charArray[c]);
			doubleChars[2*c + 1] = (charArray[c]);
		}
		/*String output = "";
		for (int i=0; i < input.length(); i++) {
			output += input.charAt(i);
			output += input.charAt(i);
		}
		return output
	}*/
		String output = doubleChars.toString(); //form elements of array into string
		return output;
	}
}
//incomplete