package conditionalStatements;

public class largestnumber {

	public static void main(String[] args) {
		
		int num1 = 20, num2 =  5,num3 = 70;
		
		if(num1<=num2 && num1<=num3) {
			
			System.out.println("num1 is the less value");
			
		} else if(num2<=num1 && num2<=num3){
			
			System.out.println("num2 is the less value");
		} else {
			
			System.out.println("num3 is the less value");
		}
		
	}

}
