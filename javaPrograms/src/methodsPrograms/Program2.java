package methodsPrograms;

public class Program2 {
	
	 public String names(String Fname) {
		 
		 String Fname1 = "Ravikumar";
		String name = Fname1+Fname;
		return name;
		
	 }

	public static void main(String[] args) {
		
		Program2 obj = new Program2();
		String names = obj.names("rahul");
		System.out.println(names);
	}

}
