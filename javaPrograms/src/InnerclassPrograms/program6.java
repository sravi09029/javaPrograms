package InnerclassPrograms;

public class program6 {
	
	public static void main(String[] args) {
		
		program5 obj = new program5();
		program5.demo ob = obj.new demo();
		System.out.println("value of a = "+ob.a);
	}

}
