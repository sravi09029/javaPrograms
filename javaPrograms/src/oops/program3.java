package oops;

public class program3 {
	

		static program2 get(int x, int y) {
			
			return new program2(x * y, (double) x / y, (x + y));
		}

		public static void main(String[] args) {
			program2 ans = get(25, 5);
			System.out.println("Multiplication = " + ans.a);
			System.out.println("Division = " + ans.b);
			System.out.println("Addition = " + ans.c);
		}

}
