package runTime;

public class program2 extends Program{
	
	protected void sum(int a,  int b) {
		 
		 System.out.println("sum is: "+(a+b));
	 }

	public static void main(String[] args) {
		
		program2 obj   = new program2();
		obj.sum(10, 20); // 30
		
		Program obj2 = new Program();
		obj.sum(400, 500);
		
		Program obj3 = new program2(); // Upcating
		 obj3.sum(100, 0);
		 
		 obj3 = obj2;
		 obj3.sum(200,300);
		
		
	}

}
