package methodOverloadingPrograms;

public class changedatatypeProgram {
	
	 public void sum(int a,  int b) {
		 
		 System.out.println("Sum is: "+(a+b));
	 }
	 
	 public void sum(float a, float b) {
		 
		 System.out.println("Sum is: "+(a+b));
	 }

	public static void main(String[] args) {
		
		changedatatypeProgram obj = new changedatatypeProgram();
		
		obj.sum(100, 200);
		obj.sum(12.0f, 25.7f);
	}

}
