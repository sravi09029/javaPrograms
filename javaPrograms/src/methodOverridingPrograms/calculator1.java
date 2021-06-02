package methodOverridingPrograms;

public class calculator1 extends calculator{
	
	
	static void sum(int a, int b) {
		
		System.out.println("sum is: "+(a+b));
	}
	
	protected void div(int a, int b) {
		
		 System.out.println("Div is: "+(a/b));
	}
	
 public void mul(int a, int b) {
		
		System.out.println("mul is: "+(a*b));
	}


	public static void main(String[] args) {
		
		calculator1 obj = new calculator1();
		obj.sum(20, 30);
		
		obj.div(10, 2);
		
		obj.mul(10, 2);
		
		
		/*
		 * calculator obj1 = new calculator(); obj1.sum(100, 200);
		 */
	}

}
