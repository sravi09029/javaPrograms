package instanceOfPrograms;

public class pchild  extends parent{

	public static void main(String[] args) {
				
		parent obj = new pchild();
		pchild.show(obj);
		
	}
	
	public void check() {
		
		System.out.println("Successfully done.........");
	}
	
	public static void show(parent obj) {  // Aggregation
		
		if(obj instanceof pchild) {
			
			pchild b1 = (pchild) obj;  // downcasting
			b1.check();  
		}
		
	}

}
