package stringPrograms;

public class containsProgram {

	public static void main(String[] args) {
		
		String str = "Hello java program ioos executed";
		
		boolean b  = str.contains("java");
		System.out.println(b);
		
		System.out.println(str.contains("is"));
		
		System.out.println(str.contentEquals("Ravi"));
	}

}
