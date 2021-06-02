package constructorsPrograms;

public class Program1 {
	
	String Langugae;
	
	 protected Program1(String lang){
		 
		 Langugae = lang;
		 System.out.println(Langugae+" Programing learning");
	 }

	public static void main(String[] args) {
		
		Program1 obj1 = new Program1("java");
		Program1 obj2 = new Program1("Python");
		Program1 obj3 = new Program1("Ruby");
		
		
	}

}
