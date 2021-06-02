package constructorsPrograms;

public class constructorChangingProgram {
	
	constructorChangingProgram(){
		
		this(5);
	}
	
	
	constructorChangingProgram(int x){
		
		System.out.println("x value is: "+x);
		
	}
	
	public static void main(String[] args) {
		
		constructorChangingProgram obj = new constructorChangingProgram();
	}

}
