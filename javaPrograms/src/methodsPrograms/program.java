package methodsPrograms;

public class program {
	
	 public int addnumbers(int a,int b) {
		 
		 int sum = a+b;
		return sum;
		 
	 }

	public static void main(String[] args) {
		
		int num1 = 20;
		int num2 = 30;
		
		program obj = new program();
		
		int results = obj.addnumbers(num1, num1);
		System.out.println("Sum value  is: "+results);
		
			
		
	}

}
