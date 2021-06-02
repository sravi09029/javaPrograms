package staticProgram;

public class staticblock {
	
	 int id;
	 String name;
	 static String college = "AITS Rajampet";
	
	 static {
		 
		 System.out.println("Static block is  executed");
	 }
	 
	  public void details() {
		  
		  System.out.println(id + " - "+ name + " - " + college);
		  
	  }

	public static void main(String[] args) {	
		
		staticblock obj = new staticblock();
		obj.id = 100;
		obj.name = "Ravikumar";
		obj.details();
		
	}

}
