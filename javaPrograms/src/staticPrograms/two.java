package staticPrograms;

public class two extends one{
	
	static {
		
		System.out.println("Inside child static block");
		
	}
	
	two(){
		
		System.out.println("child class constructor");
		
	}
	
	{
		System.out.println("initialization  child static block");
	}

	public static void main(String[] args) {
		
		new one();
		new two();
		new two();
		System.out.println("main method");
		
	}

}
