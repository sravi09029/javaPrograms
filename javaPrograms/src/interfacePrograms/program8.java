package interfacePrograms;

public class program8 implements program6, program7{

	@Override
	public void addition(int c, int d) {
		System.out.println("addition value is: "+(c+d));
	}
	
	public static void main(String[] args) {
		
		program8 obj  = new program8();
		obj.addition(20, 50);
		obj.mul(5, 5);
		
		
	}

	@Override
	public void mul(int c, int d) {
		System.out.println("multiplication value is: "+(c+d));
		
	}

}
