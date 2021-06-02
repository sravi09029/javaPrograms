package staticPrograms;

public class blockExample {
	
	static int num;
	static String name;
	
	 int age;
	
	static {
		
		System.out.println("Static block1");
		
		num =  100;
		name = "ravcikumar";
		//age = 23;
	}
	
	static {
		
		System.out.println("static block2");
		num =  99;
		name = "Yamini";
	}

	public static void main(String[] args) {
		
		System.out.println("number is: "+num);
		System.out.println("Name is: "+name);
		
	}

}
