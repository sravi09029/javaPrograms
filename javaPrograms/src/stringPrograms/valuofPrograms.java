package stringPrograms;

public class valuofPrograms {

	public static void main(String[] args) {
		
		int num = 45;
		byte num1 = 127;
		
		String str = String.valueOf(num);  //converting int to String
		System.out.println(str);
		System.out.println("type of num is: "+str.getClass().getName());
		
		String str1 = String.valueOf(num1);
		System.out.println(str1);
		System.out.println("type of num1 is: "+str1.getClass().getName());
		
		char c = 'f';
		String str2 = String.valueOf(c);
		System.out.println(str2);
		System.out.println("type of c is: "+str2.getClass().getName());
	}

}
