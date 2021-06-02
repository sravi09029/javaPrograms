package VariablesPrograms;

public class Program {
	
	String name = "Ravikumar"; //instance variable
	
	static String name_emp = "Rahul";  // static variable
	
	public void method() {
		
		int number = 200;
		String name = "Uday";
		System.out.println(number);
		System.out.println(name);
	}

	public static void main(String[] args) {
		
		Program obj1  = new Program();
		Program obj2 = new Program();
		Program obj3 = new Program();
		
		System.out.println(obj1.name);
		System.out.println(obj2.name);
		System.out.println(obj3.name);
		
		System.out.println("------------------------");
		
		System.out.println(obj1.name_emp);
		System.out.println(obj2.name_emp);
		System.out.println(obj3.name_emp);
		
		System.out.println("============================");
		
		obj2.name = "kumar";
		
		obj2.name_emp = "Trilokya";
		
		//Program.name_emp = "Yamini";
		
		System.out.println(obj1.name);
		System.out.println(obj2.name);
		System.out.println(obj3.name);
		
		//Program.name_emp = "Yamini";
		
		
		System.out.println("-------------------------------");
		
		System.out.println(obj1.name_emp);
		System.out.println(obj2.name_emp);
		System.out.println(obj3.name_emp);
		
		System.out.println("-----------------------------");
		
		obj1.method();
		
		System.out.println("-----------------------------");
		
		//System.out.println(obj1.number);
		
		
	}

}
