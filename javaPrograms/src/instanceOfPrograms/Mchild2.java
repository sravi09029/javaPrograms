package instanceOfPrograms;

public class Mchild2 extends MDemo{

	
	  public static void main(String[] args) {
		
		  Mchild2 obj = new Mchild2(); // Child2 object
		  Mchild1 obj1 = new Mchild1(); // child1 object
		  MDemo obj2 = new MDemo(); // parent object
		  
		  
		  System.out.println(obj2 instanceof Mchild1); // false
		  System.out.println(obj2 instanceof Mchild2); // false
		  System.out.println(obj2 instanceof MDemo); //true
		  System.out.println(obj instanceof Mchild2); // true
		  System.out.println(obj1 instanceof Mchild1); // true
		  
		  
		  System.out.println("-------------------------");
		  
		  System.out.println(obj instanceof MDemo); // true
		 // System.out.println(obj instanceof Mchild1); // false
		  System.out.println(obj1 instanceof MDemo); // true
		  
		  System.out.println("----------------------");
		  
		  obj2  = obj1;
		  System.out.println(obj2 instanceof Mchild1); // true
		  System.out.println(obj2 instanceof Mchild2); // false
		  
		  System.out.println("---------------------");
		  
		  obj2 = obj;
		  System.out.println(obj2 instanceof Mchild2); // true
		  System.out.println(obj2 instanceof Mchild1); // false
		  
		  
		  
		  
		  
	}
}
