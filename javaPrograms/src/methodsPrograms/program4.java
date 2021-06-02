package methodsPrograms;

public class program4 {
	
	 public void method() {
		 
		 System.out.println("Methiod is displayed");
	 }
	 
	  public static void method1(int a) {
		  
		  System.out.println("a value is: "+a);
		
	  }

	public static void main(String[] args) {
			
		
		program4 obj  = new program4();
		
		obj.method();
		
		obj.method1(10);
	}

}
