package objects;

public class HelloWorld {	
	public static void main(String[] args) {

//1 Print
		/*	System.out.println("Hello World!");
		}
	}	*/
		
//2 Variable

		/*	String words = "Hello World!";
			System.out.println(words);
		}
	}	*/
			
//3 Method
		/*	printText("Hello World!");
		}
			public static void printText(String T){
				System.out.println(T);
			}

	}	*/
			
//4 Return
		/*	System.out.println(returnHi());
		}
			public static String returnHi(){
					return "Hello World!";
				}
				
	}	*/
			
//5 Int
		/*	int a = 5;
			int b = 8;
			System.out.println(add(a,b));
		}
			public static int add(int a, int b){
					return a+b;
				}
	}	*/
			
//6 Contiditonal 1
		/*	int a = 5;
			int b = 8;
			boolean c = false;
				if (c) {
					System.out.println(a+b);
				} else {
					System.out.println(a*b);
				}
		}
	}	*/
			
//7 Contiditonal 2
		/*	int a = 5;
			int b = 8;
			boolean c = true;
			System.out.println(Num(a,b,c));
		}
		public static int Num(int A, int B, boolean C){
					if (A==0) {
						return B;
					} else if (B==0) {
						return A;
					} else if (C) {
						return A+B;
					} else {
						return A*B;
				}
			}
	}	*/
			
//8 Iteration
		/*	int b = 8;
			boolean c = false;
			for (int i=0; i<10; i++)
			System.out.println(Num(i,b,c));
		}
		public static int Num(int A, int B, boolean C){
			if (A==0) {
				return B;
			} else if (B==0) {
				return A;
			} else if (C) {
				return A+B;
			} else {
				return A*B;
				}
		}
	}	*/
			
//9 Array
		/*	int[] array = {5, 7, 1, 4, 11, 0, 2, 1, 9, 3};
			int a = array[5];
			int b = 8;
			boolean c = true;
			System.out.println(Num(a,b,c));
		}
		public static int Num(int A, int B, boolean C){
			if (A==0) {
				return B;
			} else if (B==0) {
				return A;
			} else if (C) {
				return A+B;
			} else {
				return A*B;
				}
		}
	}	*/
			
//10 Iteration/Array 1
		/*	int[] array = {5, 7, 1, 4, 11, 0, 2, 1, 9, 3};
			int b = 8;
			boolean c = false;
			for (int i:array)
			System.out.println(Num(i,b,c));
		}
		public static int Num(int A, int B, boolean C){
			if (A==0) {
				return B;
			} else if (B==0) {
				return A;
			} else if (C) {
				return A+B;
			} else {
				return A*B;
				}
		}
	}	*/
			
//11 Iteration/Array 2
		/*	int[] array2 = new int[10];
			for (int i=0; i<array2.length; i++) {
				array2[i] = i;
				array2[i] = array2[i]*10;
			}
			for (int j:array2) {
				System.out.println(j);
			}
		}
	}	*/
		
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
		
		/*int a = 1;
		int b = 1;
		int c = 1;
		UniqueSum u = new UniqueSum();
		System.out.println(u.uniqueSum(a,b,c));*/
		
//14 Too Hot?		
		
		/*int temperature = 105;
		boolean isSummer = true;
		TooHot t = new TooHot();
		System.out.println(t.tooHot(temperature,isSummer));*/
		
	}
}