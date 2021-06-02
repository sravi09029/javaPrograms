package widingTypecasting;

public class program1 {

	public static void main(String[] args) {
		
			//byte ---> short ---> int ---> long ---> float ---> double
		
		 byte b = 127;
		 System.out.println("Byte b value is: "+b);
		 
		 short a = b;
		 System.out.println("Short a Value is: "+a);
		 
		 int c = a;
		 System.out.println("int c value is: "+c);
		 
		long d = c;
		System.out.println("long d value is: "+d);
		
		float e = d;
		System.out.println("float e value is: "+e);
		
		double f = e;
		System.out.println("double f valueb is: "+f);
		
		short g = 133;
		double h = g;
		System.out.println("double h value is: "+h);
		 
		 
		
		}

}
