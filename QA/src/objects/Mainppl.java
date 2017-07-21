package objects;

public class Mainppl {
	public static void main(String[] args) {
		People p1= new People("Bob", 45, "builder");
		People p2= new People("Colin", 34, "civil servant");
		People p3= new People("Greg", 50, "plumber");
		People p4= new People("Abdul", 24, "software developer");
		People p5= new People("Donna", 18, "student");
		People p6= new People("Emily", 76, "retiree");
		People p7= new People("Fatima", 24, "lawyer");
		People p8= new People("Olivia", 5, "child");
		People[] array = {p1, p2, p3, p4, p5, p6, p7, p8};
		for (int i=0; i<array.length; i++) {
			System.out.println(array[i].details());
		}
	}

}
