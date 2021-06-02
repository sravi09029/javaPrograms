package accessModifiers;

public class Test extends demo{

	public static void main(String[] args) {
		
		demo obj = new demo();
		
		obj.method(); // protected value is displayed
	}

}
