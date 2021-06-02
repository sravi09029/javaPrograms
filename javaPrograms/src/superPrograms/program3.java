package superPrograms;

public class program3 extends program1{
	
	int fee;
	
	public void method() {
		
		super.name = "Kumar";
	
		System.out.println("Fee is: "+fee);
		
		System.out.println("name is:  "+super.name);
		
		super.d = 20;
		
		System.out.println("double valueb is: "+super.d);
	}

	public static void main(String[] args) {
		
		program2 obj = new program2();
		obj.disp();
		
		program3 obj1 = new program3();
		obj1.method();
		
		
	}

}
