package thisPrograms;

public class program2 {

	 String name;
	 int x;
	 
	  program2(String name, int x) {
		 
		 name = name;
		 x  = x;
		 
	 }
	
	public static void main(String[] args) {
		
		program2 obj = new program2("Ravikumar",9);
		
		System.out.println("Name is: "+obj.name);
		System.out.println("x value is: "+obj.x);
		
	}

}
