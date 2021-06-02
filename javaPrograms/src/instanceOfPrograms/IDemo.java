package instanceOfPrograms;

public class IDemo implements Demo {
	
	
	@Override
	public void show() {
		
		System.out.println("Calling......");
	}

	

	public static void main(String[] args) {
		
		Demo obj = new IDemo();
		
		System.out.println(obj instanceof Demo); // true
		
		System.out.println(obj instanceof IDemo); // true
		
		System.out.println("-------------------------------");
		
		IDemo obj1 = new IDemo();
		
		System.out.println(obj1 instanceof Demo); // true
		System.out.println(obj1 instanceof IDemo); // true
		
		System.out.println("-----------------------------------");
		
		//Demo obj3 = new Demo();
		
		
		
		
	}

	
}
