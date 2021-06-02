package stringPrograms;

public class indexProgram {

	public static void main(String[] args) {
		
		String s1 = "Hello java programs";
		
		int s2 = s1.indexOf('l');
		System.out.println(s2);
		
		System.out.println(s1.indexOf('j'));
		
		System.out.println(s1.indexOf('a', 6));
		
		String subString = "java";
		System.out.println(s1.indexOf(subString));
		System.out.println(s1.indexOf(subString, 7));
		
		System.out.println(s1.indexOf('h'));
	}

}
