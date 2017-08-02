package objects;
//15 People
public class People {
	private String name;
	protected int age;
	private String jobTitle;
	public People(String a, int b, String c) {
		name = a;
		age = b;
		jobTitle = c;
	}
	public String details () {
		return "My name is " + name + ", I'm " + age + " years old, and I'm a " + jobTitle;
	}
	public String peopleWrite() {
		return name + ", " + age +", " + jobTitle + "\n";
	}
}