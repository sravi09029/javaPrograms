package constructorsPrograms;

public class parameterizedConstructor {
	
	int x;
	int y;
	
	parameterizedConstructor(int a,int b){
		
		x=a;
		y=b;
		
		System.out.println("x value is: "+x);
		System.out.println("y value is: "+y);
	}

	public static void main(String[] args) {
		
		
		parameterizedConstructor obj1 = new parameterizedConstructor(100,20);
		parameterizedConstructor obj2 = new parameterizedConstructor(30,40);
	
		
	}

}
