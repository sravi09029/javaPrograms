package superPrograms;

public class singleProgram1 extends singleProgram{
	
	int x = 100;
	
	String name;
	
	 public void disp() {
		 
		 super.show(); // parent method is calling
		 System.out.println("X value is: "+x);
		 
		 name = "Java";
		 System.out.println("subject name is: "+name);
		 
	 }

	public static void main(String[] args) {
		
		singleProgram1 obj = new singleProgram1();
		obj.disp();
		
	}

}
