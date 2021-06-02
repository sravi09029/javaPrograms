package exceptionHandlingPrograms;

public class multiplecatchprogram1 {

	public static void main(String[] args) {

		try {
			int[] a = new int[2];
			System.out.println(a[2]);

		} catch (ArithmeticException e) {
			System.out.println(" Arithmetic " + e);
		} catch (NullPointerException e) {
			System.out.println("Null pointer " + e);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Array Index of Bounds " + e);
		}
	}

}
