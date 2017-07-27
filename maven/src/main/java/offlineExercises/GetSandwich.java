package offlineExercises;

public class GetSandwich {
	public String getSandwich(String input) {
		String[] array = input.split("bread");
		String output = array[1];
		return output;
	}
}
//done!