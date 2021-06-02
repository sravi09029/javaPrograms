package staticProgram;

public class variablesProgram {
	
	 String name;
	 int id;
	 static String college = "AITS Rajampet";
	 
	  public void disp() {
		  
		  System.out.println(name +" - "+ id +" - "+ college);
	  }

	public static void main(String[] args) {
		
		variablesProgram obj = new variablesProgram();
		obj.name = "Ravikumar";
		obj.id = 100;
		obj.disp();
		
		
	}

}
