package oops;

public class Lamp {
	
	  boolean isON;
	  
	   void turnON() {
		   
		   isON = true;
		   System.out.println("Light on?: "+isON);
		   
	   }
	   
	    void turnoff() {
	    	
	    	isON = false;
	    	 System.out.println("Light off?: "+isON);
	    }
	  

	public static void main(String[] args) {
		
		Lamp led = new Lamp();
		Lamp halogen = new Lamp();
		
		led.turnON();
		halogen.turnoff();
				
	}

}
