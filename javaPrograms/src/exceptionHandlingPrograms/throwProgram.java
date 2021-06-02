package exceptionHandlingPrograms;

public class throwProgram {

	static void avg() {

		try {

			throw new ArithmeticException("demo");
		} catch (ArithmeticException e) {

			System.out.println("Exception occured");
		}
	}

	public static void main(String[] args) {
		
		avg();

	}

}
