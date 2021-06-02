package interfacePrograms;

public class program2 implements program{

	@Override
	public void method() {

		System.out.println("average speed is: "+average_speed);
		
	}
	
	public static void main(String[] args) {
		
		program2  obj = new program2();
		obj.method();
		program.disp();
		System.out.println(obj.average_speed);
	}
	
	

}
