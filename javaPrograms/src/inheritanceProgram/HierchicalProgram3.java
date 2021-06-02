package inheritanceProgram;

public class HierchicalProgram3 extends HierchicalProgram1{
	
	String name = "Java";
	
	public void method() {
		
		System.out.println("Child2 name is: "+name);
	}

	public static void main(String[] args) {
		
		HierchicalProgram3 obj = new HierchicalProgram3();
		
		obj.show();
		obj.method();
		
		HierchicalProgram2 obj1 = new HierchicalProgram2();
		obj1.disp();

		
	}

}
