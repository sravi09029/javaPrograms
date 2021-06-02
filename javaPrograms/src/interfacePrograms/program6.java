package interfacePrograms;

public interface program6 {
	
	 int a =200;
	
	
// default  method is accepted
	default void method() {
		System.out.println("interface default method displayed");
	}
	
	static void disp() {
		
		System.out.println("interface static method displayed");
	}
	
	abstract void addition(int a,int b);
	
	void mul(int c,int  d);
}
