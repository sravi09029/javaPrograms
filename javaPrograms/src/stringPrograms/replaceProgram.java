package stringPrograms;

public class replaceProgram {

	public static void main(String[] args) {
		
		String s1 = "ravi kumar";
		String s3 = "Ravi";
		
		String s2 = s1.replace('k', 'K');
		System.out.println(s2);
		
		String s4 = s1.replace(s1, s3);
		
		System.out.println(s4);
		
		System.out.println(s3.replaceAll(s4, s2));
	}

}
