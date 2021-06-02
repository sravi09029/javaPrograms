package abstarctPrograms;

public class program2 extends program1{

	public static void main(String[] args) {

		program2 obj = new program2();
		obj.method();
		obj.addition(20, 30);
		obj.disp();
	}

	@Override
	void method() {
		
		System.out.println("abstract class  method");
	}

	@Override
	double addition(double a, double b) {
		
		System.out.println("addition is: "+(a+b));
		
		return 0;
	}

}
