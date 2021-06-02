package thisPrograms;

public class Program {
	
	 double height, width;
	 
	 Program(double h, double w){
		 
		 this.height = h;
		 this.width = w;
		 
	 }

	public static void main(String[] args) {
		
		Program obj = new Program(10,20);
		
		System.out.println("height of the value: "+obj.height);
		System.out.println("width of the value: "+obj.width);
			
	}

}
