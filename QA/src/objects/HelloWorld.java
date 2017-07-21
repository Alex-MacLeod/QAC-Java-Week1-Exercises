package objects;

public class HelloWorld {	
	public static void main(String[] args) {
//12 Blackjack
	/*	int a = 22;
		int b = 4;
		System.out.println(blackJack(a,b));
	}
	public static int blackJack(int A, int B){
				if (A>21 & B>21) {
					return 0;
				} else if (A>B && A<21 || B>21) {
					return A;
				} else {
					return B;
			}*/

//13 Unique Sum		
		
		int a = 1;
		int b = 1;
		int c = 1;
		UniqueSum u = new UniqueSum();
		System.out.println(u.uniqueSum(a,b,c));
		
//14 Too Hot?		
		
		int temperature = 105;
		boolean isSummer = true;
		TooHot t = new TooHot();
		System.out.println(t.tooHot(temperature,isSummer));
		
	}
}