package staticPrograms;

public class staticvariableProgram {
	
	static int number = 100;
	static String name;

	public static void main(String[] args) {
		
		staticvariableProgram obj1  = new staticvariableProgram();
		staticvariableProgram obj2  = new staticvariableProgram();
		
		obj1.number = 99;
		obj1.name =  "Ravi";
		
		
		obj1.number = 88;
		obj1.name =  "kumar";
		
		System.out.println("Number is: "+obj1.number);
		System.out.println("Name is: "+obj1.name);
		System.out.println("Number is: "+obj2.number);
		System.out.println("Name is: "+obj2.name);
		
		
		
	}

}
