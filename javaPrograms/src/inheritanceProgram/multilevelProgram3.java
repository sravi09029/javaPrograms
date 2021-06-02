package inheritanceProgram;

public class multilevelProgram3 extends multilevelProgram2 {
	
	int g = 20;
	
	public void method() {
		
		System.out.println("G value is: "+g);
	}

	public static void main(String[] args) {
		
		multilevelProgram3 obj = new multilevelProgram3();
		
		obj.show(); // parent method is calling
		obj.method(); // child method is  calling
		obj.disp();
		
	}

}
