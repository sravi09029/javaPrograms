package thisPrograms;

public class methodcalling {
	
	 public void getobject() {
		 
		 System.out.println("Java learning");
	 }
	 
	  public void disply() {
		  		  
		  this.getobject(); // Method calling
	  }

	public static void main(String[] args) {
		
		methodcalling obj = new methodcalling();
		obj.disply();
	}

}
