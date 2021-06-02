package stringPrograms;

public class getByteProgram {
	
	public static void main(String[] args) {
		
		String str = "hello java";
		byte[] ch = str.getBytes();
		for(int i = 0; i<ch.length;i++) {
			
			System.out.println(ch[i]);
		}
	}

}
