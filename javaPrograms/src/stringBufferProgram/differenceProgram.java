package stringBufferProgram;

public class differenceProgram {

	public static void main(String[] args) {
		
		String str = "Ravi";
		str.concat("kumar");
		System.out.println(str); // Ravi
		
		StringBuffer str1 = new StringBuffer("hello");
		str1.append("java");
		System.out.println(str1); //hellojava
	}

}
