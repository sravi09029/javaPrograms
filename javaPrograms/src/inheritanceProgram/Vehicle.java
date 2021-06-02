package inheritanceProgram;

public class Vehicle extends engine{
	
	public void TVS() {
		
		System.out.println("Child class TVS Vehicle");
	}
	
	public static void main(String[] args) {
		
		Vehicle obj = new Vehicle();
		
		obj.Hengine(); // parent method calling
		obj.TVS();     // child method is calling
		obj.Sengine(); // parent method calling
		obj.Tengine(); // parent method calling
		
	}

}
