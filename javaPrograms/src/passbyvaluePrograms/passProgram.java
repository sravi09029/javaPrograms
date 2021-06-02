package passbyvaluePrograms;

public class passProgram {
	
	 public static void change(int x,int y) {
		 
		 x++;
		 y++;
		 
		 
	 }

	public static void main(String[] args) {
		
		passbyvalue obj = new passbyvalue(25, 5);
		
		
		change(obj.x, obj.y);
		
		System.out.println("X value is: "+obj.x);
		System.out.println("X value is: "+obj.y);

	}

}