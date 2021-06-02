package stringPrograms;

public class concatProgram {

	public static void main(String[] args) {
			
		String s1 = "Hello";
		String s2 = "Java";
		String s3 = "java";
		
		String str = s1.concat(s2);
		System.out.println("Str  valuer is: "+str);
		System.out.println(str.hashCode());
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s3.hashCode());
	}

}
