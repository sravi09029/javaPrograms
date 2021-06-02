package operatorsPrograms;

public class program {

	public static void main(String[] args) {
		
		int num1 = 100;
		int  num2 = 20;
		
		
		
		int d = num1++;   // num1 = 101
		System.out.println("d value is: "+d); // printed 100
		
		 
		int c =   num2--; // num2 = 19
		System.out.println("c value is: "+c); // printed 20
		
		int a = ++num1; // num1 = 101+1
		System.out.println("a value is: "+a); // printed 102
		
		int b = --num2; // num2 = 19-8
		System.out.println("b value is: "+b); // printed 18
		
		System.out.println("------------------------------------");
		
		
		int  num3 = 5;
		int num4 = 10;
		
		num3++;
		num4--;
		
		System.out.println("num3 value is: "+num3);
		System.out.println("num4 valueb  is: "+num4);
		
		System.out.println("---------------------------------");
		
		--num3;
		++num4;
		
		System.out.println("num3 value is: "+num3);
		System.out.println("num4 valueb  is: "+num4);
		
	}

}
