package methodOverloadingPrograms;

public class Program1 {
	
	 public static void method(int a, int b) {
		 
		 System.out.println("Sum is: "+(a+b));
	 }

	 public static void method(int a) {
		 
		 System.out.println("a value is: "+(a));
	 }
	 
	 final void method(int b,float f) {
		 
		 System.out.println("Method value is: "+(b+f));
	 }
	 
	 final void method(float f, int b) {
		
		 System.out.println("Method value is: "+(f+b));
	 }
	 
  protected void method1(int b,float f) {
		 
		 System.out.println("Method value is: "+(b+f));
	 }
	 
  protected void method1(float f, int b) {
		
		 System.out.println("Method value is: "+(f+b));
	 }
	 
	 
	public static void main(String[] args) {
		
		
	}

}
