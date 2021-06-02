package conditionalStatements;

public class program3 {

	public static void main(String[] args) {
				
		int marks = 70;
		
		if(marks<=50) {
			
			System.out.println("D Division");
			
		} else if(marks>=50 && marks<=60) {
			
			System.out.println("C division");
		} else {
			
			System.out.println("failed");
		}
	}

}
