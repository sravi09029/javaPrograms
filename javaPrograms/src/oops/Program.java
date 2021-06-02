package oops;

public class Program {
	
	 String name;
	 int rollnum;
	 int age;
	 
	  void info() {
		  System.out.println("student name is: "+name);
		  System.out.println("student rollnum is: "+rollnum);
		  System.out.println("student age is: "+age);
	  }

	public static void main(String[] args) {
		
		Program obj = new Program();
		
		obj.name = "Ravikumar";
		obj.rollnum = 100;
		obj.age = 27;
		
		obj.info();
			
		 
	}

}
