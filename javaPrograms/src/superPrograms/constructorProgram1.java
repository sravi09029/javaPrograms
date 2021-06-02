package superPrograms;

public class constructorProgram1 extends constructorProgram{
	 
	 String subject;
	 
	 public constructorProgram1(String n1, String n2) {
		 
		 super(n1);
		 this.subject = n2;
		
	 }
	 
	 public void details() {
		 
		 System.out.println(super.name+" "+subject);
	 }

	public static void main(String[] args) {
		
		constructorProgram1 obj = new constructorProgram1("Ravikumar","java");
		obj.details();
		
	}

}
