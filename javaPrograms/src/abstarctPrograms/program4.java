package abstarctPrograms;

public class program4 extends program3{
	
	public String engine() {
		System.out.println("4 strokes, ait colled engine");
		
		return null;
		
	}
	
	@Override
	String vehicle() {
		
		System.out.println("TVS company");
		return null;
	}

	public static void main(String[] args) {
		
		program3 obj = new program4();
		obj.vehicle();
		//obj.eng
		System.out.println(obj.a);
		
		System.out.println(obj instanceof program4); //  true
		
		program4 obj1 = new program4();
		

	}

	

}
