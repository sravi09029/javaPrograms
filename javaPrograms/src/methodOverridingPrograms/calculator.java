package methodOverridingPrograms;

public class calculator {
	
	static void sum(int a, int b) {
		
		System.out.println("sum is: "+(a+b));
	}
	
	protected void div(int a, int b) {
	
		 System.out.println("Div is: "+(a/b));
	}
	
	public void mul(int a, int b) {
		
		System.out.println("mul is: "+(a*b));
	}
	

}
