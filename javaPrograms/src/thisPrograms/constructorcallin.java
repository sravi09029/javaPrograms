package thisPrograms;

public class constructorcallin {
	
	
	constructorcallin(){
		
		// calling constructor
		this("Ravikumar");
	}
	
 constructorcallin(String str){
	 
	 	System.out.println(str);
		
	}
	
	 

	public static void main(String[] args) {
		
		constructorcallin obj = new constructorcallin();
	}

}
