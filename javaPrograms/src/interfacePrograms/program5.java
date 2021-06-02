package interfacePrograms;

public class program5 implements program3,program4{
	
	int width;
	
	
	@Override
	public boolean isrollble() {
		
		return false;
	}

	@Override
	public boolean ismoveable() {
		
		return true;
	}
	

	public static void main(String[] args) {
		
		program5 obj = new program5();
		System.out.println(obj.ismoveable());
		System.out.println(obj.isrollble());
	}

	@Override
	public void method() {
		
	}

	

}
