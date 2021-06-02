package methodsPrograms;

public class parameterProgram {
	
	 public void names(String Fname, String Lname) { // Fname , LNAme are parameter list
		
		 System.out.println("First Name  is: "+Fname);
		 System.out.println("Last Name  is: "+Lname);
		 
		// return Fname;
				 
	 }

	public static void main(String[] args) {
		
		
		parameterProgram obj = new parameterProgram();
		
		 // Ravi, Kumar are Arguments list
		obj.names("Ravi", "kumar");
		
	}

}
