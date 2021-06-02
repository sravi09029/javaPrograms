package stringPrograms;

public class ignorecaseProgram {

	public static void main(String[] args) {
		
		String s1 = "Ravi kumar";
		String s2 = "Kumar";
		
		boolean b = s1.equalsIgnoreCase(s2);
		System.out.println(b);
		
		System.out.println(s2.equalsIgnoreCase(s2));
		
		System.out.println(s1.equalsIgnoreCase("RAVI KUMAR"));
	}

}
