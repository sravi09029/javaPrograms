package exceptionHandlingPrograms;

public class trycatchProgram {
	
	public static void main(String[] args) {
		
		int a,b,c;
		try {
		a = 10;
		b = 0;
		c =   a/b;
		
		System.out.println("Thisb is line will not be occured");
		
		} catch (ArithmeticException e) {
			
			System.out.println("Divide by zero");
		}
		
		System.out.println("After exception is handled");
		
	}

}
