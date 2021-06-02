package staticProgram;

public class staticMethod {
	
	 public static void square(int i) {
		 
		 System.out.println(i*i);
	 }

	public static void main(String[] args) {
			
	    square(8);   //static method square () is called without any instance of class.
		
	}

}
