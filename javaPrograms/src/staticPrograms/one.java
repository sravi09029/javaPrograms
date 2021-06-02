package staticPrograms;

public class one {
	
	static {
		
		System.out.println("Inside parent static block");
	}
	
	one(){
		
		System.out.println("Parent class constructor");
	}
	
	{
		System.out.println("initialization  parent static block");
	}

}
