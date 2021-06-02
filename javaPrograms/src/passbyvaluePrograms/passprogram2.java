package passbyvaluePrograms;

public class passprogram2 {
	
	public static void change(passbyvalue1 passvalue) {
		 
		passvalue.x++;
		passvalue.y++;
		 
		 
	 }

	public static void main(String[] args) {
		
		
		
		passbyvalue1 obj = new passbyvalue1(10,20);
		
		change(obj);
		System.out.println("X value is: "+obj.x);
		System.out.println("X value is: "+obj.y);
	}

}
