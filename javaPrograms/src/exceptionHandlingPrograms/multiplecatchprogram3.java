package exceptionHandlingPrograms;

public class multiplecatchprogram3 {

	public static void main(String[] args) {
			
		try {
		int[] a = new int[2];
		a[3] = 3/0;
		//System.out.println(a[3]);
		} catch (Exception e) {
			
			 System.out.println("Generic exception");
			} /*
				 * catch (ArrayIndexOutOfBoundsException e) {
				 * 
				 * S	ystem.out.println("array index out of bound exception"); }
				 */
	}

}
