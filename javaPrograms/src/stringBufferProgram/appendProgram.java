package stringBufferProgram;

public class appendProgram {

	public static void main(String[] args) {
			
		StringBuffer str = new StringBuffer("hello");
		str.append(123);
		System.out.println(str);
		
		str.append("h");
		System.out.println(str);
		
	}

}
