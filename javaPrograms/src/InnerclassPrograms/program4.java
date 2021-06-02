package InnerclassPrograms;

import InnerclassPrograms.program3.demo;

public class program4 {
	
	public static void main(String[] args) {
		
		program3  obj = new program3();
		program3.demo ob = obj.new demo();
		
		ob.sub(20, 5);
	}

}
