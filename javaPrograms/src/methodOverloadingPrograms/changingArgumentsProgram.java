package methodOverloadingPrograms;

public class changingArgumentsProgram {
	
	 public void sum(int a, int b) {
		
		 System.out.println("SUm is: "+(a+b));
	 }
	 
	 public void sum(int a, int  b, int c) {
		 
		 System.out.println("Sum is: "+(a+b+c));
	 }

	public static void main(String[] args) {
		
		changingArgumentsProgram obj = new changingArgumentsProgram();
		obj.sum(20, 50);
		obj.sum(40,0, 1000);
	}

}
