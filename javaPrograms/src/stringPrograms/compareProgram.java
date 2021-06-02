package stringPrograms;

public class compareProgram {

	public static void main(String[] args) {

		String s1 = "Hell";
		String s2 = "Hello";
		String s3 = "Hello";
		String str = new String("Hello");

		// equals() method using
		boolean s4 = s2.equals(s3);
		System.out.println(s4); // true

		s4 = s1.equals(s4);
		System.out.println(s4); // false

		// == operator using

		boolean b = (s1 == s3);
		System.out.println(b);
		
		boolean a = (s1==str);
		System.out.println(a);
		 a = (s2==s3);
		 System.out.println(a);
		 
		 // compare to() nmethod using
		 
		 //boolean m = s1.compareTo(s2);
		 int m = s1.compareTo(s2);
		 System.out.println(m);
		 
		 int f = s3.compareTo(s3);
		 System.out.println(f);

	}

}
