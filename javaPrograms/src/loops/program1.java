package loops;

public class program1 {

	public static void main(String[] args) {
		
		for(int i = 10;  i>1;i--) {
			
			if(i==4) {
				
				continue;
				//break;
			}
			System.out.println("The value of i: "+i);
		}
	}

}
