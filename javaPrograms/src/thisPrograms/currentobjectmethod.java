package thisPrograms;

public class currentobjectmethod {
	
	 public void getname() {
		 
		 System.out.println("java learning");
	 }
	 
	  public currentobjectmethod display() {
		  
		// return current object
		  return this;
	  }

	public static void main(String[] args) {
		
		currentobjectmethod obj = new currentobjectmethod();
		currentobjectmethod obj1 = obj.display();
		obj1.getname();
		
	}

}
