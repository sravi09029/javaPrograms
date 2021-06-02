package staticPrograms;

public class staticMethodProgram {
	
	static int num = 100;
	static String name = "Ravikumar";
	
	static void disp() {
		
		System.out.println("Number is: "+num);
		System.out.println("Name is: "+name);
	}
	
	void function() {
		
		//System.out.println(num);
		disp();
	}

	public static void main(String[] args) {
		
		staticMethodProgram obj = new staticMethodProgram();
		
		staticMethodProgram.disp();
		obj.function();
		
		
		
	}

}
