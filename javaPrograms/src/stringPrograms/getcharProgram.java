package stringPrograms;

public class getcharProgram {

	public static void main(String[] args) {
				String str = "Hello Welcome to studytonight.com";
				char[] ch = new char[16];
				
				try {
				str.getChars(2, 12, ch, 0);
				System.out.println(ch);
				}
				catch(Exception ex) {
					System.out.println(ex);
				}
	}

}
