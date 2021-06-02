package methodsPrograms;

public class callbyvalueProgram {
	
	 public void numbers(int a) {
		 
		 a = 100;
		// System.out.println(a);
	 }

	public static void main(String[] args) {
		
		
			int a = 50;
			
			callbyvalueProgram obj = new callbyvalueProgram();
			obj.numbers(a);    // numbers is the call by value
			System.out.println("a value is: "+a);
			
		
	}

}
