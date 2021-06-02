package finalPrograms;

public class finalMethod1 extends finalMethod{
	
	final void show() {
		 
		 System.out.println("Final method id displayed");
	 }

	public static void main(String[] args) {
		
		finalMethod1 obj = new finalMethod1();
		obj.show();
	}

}
