package narrowingTypecast;

public class Program1 {

	public static void main(String[] args) {
		
		// double --> float ---> long --> int ---> short -->byte
		
	   double a = 10.0d;
	   float b = (float) a;
	   System.out.println("float b value is: "+b);
	   
	   long c = (long) b;
	   System.out.println("long c value is: "+c);
	   
	   int d = (int) c;
	   System.out.println("int d  value is: "+d);
	   
	   short e = (short) d;
	   System.out.println("short e value is: "+e);
	   
	   byte f = (byte) e;
	   System.out.println("byte f value is: "+f);
	   
	   
	   long l = 120;
	   int j = (int)l;
	   System.out.println("int l value is: "+j);
	   
	   
	   byte k = 127;
	   int z = k;
	   System.out.println("int z  value is: "+z);
	   short v = (short) z;
	   System.out.println("short v value is: "+v);
	   
	   
		
	}

}
