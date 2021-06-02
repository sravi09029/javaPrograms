package constructorsPrograms;

public class changing { 
	
	changing(){
		
		this(10,20);
		
	}
	
	changing(int c){
		
		this("Ravi","Kumar");
		System.out.println("c value is: "+c);
   
	}
	
	changing(String city){
		
		//this(100);
		System.out.println("city name is: "+city);
	}
	
	changing(String fname, String Lname){
		
		this("Pulivendula");
		System.out.println("First namer  is: "+fname);
		System.out.println("First namer  is: "+Lname);
	}
	
	changing(int x, int b){
		
		this(100);
		System.out.println("x value is: "+x);
		System.out.println("b value is: "+b);
	}

	public static void main(String[] args) {
		
		changing obj = new changing();
	}

}
