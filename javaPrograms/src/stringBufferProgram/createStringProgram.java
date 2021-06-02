package stringBufferProgram;

public class createStringProgram {

	public static void main(String[] args) {
		
		String str = "Hello java";
		//StringBuffer str1 = new StringBuffer(str);
		StringBuffer str1 = new StringBuffer("Hello java");
		str1.append("  learning");
		System.out.println(str1);
	}
	

}
