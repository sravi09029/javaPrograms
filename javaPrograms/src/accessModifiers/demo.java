package accessModifiers;

public class demo {

	 int x = 100;  
	 
	 String name = "Ravikumar";
	 
	 double d = 10.0;
	 
	 double f = 20.0d;	
	//default modifier
	void show() {
		
		
		System.out.println("X value is: "+x);
	}
	
	//public access modifier
	public void disp() {
		
		System.out.println("Public access modifoer name: "+name);
	}
	
	//protected access modifier
	protected void method() {
		
		
		System.out.println("protected double value is: "+d);
	}
	
	private void method1() {
		
		System.out.println("Private double valueb is: "+d);
	}
	
	

}
