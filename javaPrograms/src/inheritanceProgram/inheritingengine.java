package inheritanceProgram;

public class inheritingengine extends inheritingVariable{
	
	String modelType;
	
	public void show() {
		
		vehicleName = "Honda";  //accessing Vehicle class member variable
		modelType = "Unicorn";
		
		System.out.println(vehicleName+" "+modelType);
		
	}

	public static void main(String[] args) {
			
		inheritingengine obj = new inheritingengine();
		obj.show();
		
	}

}
