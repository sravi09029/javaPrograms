package staticPrograms;

public class nestedProgram {
	
	private static String str = "BeginnersBook";
	int number = 200;

	   //Static class
	   static class MyNestedClass{
		//non-static method
		public void disp() {

		   System.out.println(str); 
		   //System.out.println(numer);
		}

	   }
	   public static void main(String args[])
	   {
	       /* To create instance of nested class we didn't need the outer
		* class instance but for a regular nested class you would need 
		* to create an instance of outer class first
	        */
		   nestedProgram.MyNestedClass obj = new nestedProgram.MyNestedClass();
		obj.disp();
	   }
}
