package thisPrograms;

public class program3 {
	
	   int x;
	   int y;
	   
	   program3(int x, int  y){
		   
		   this.x = x;
		   this.y =y;
		   
		   // value of x and y before calling add()
		   System.out.println("Before passing this to addTwo() method:");
		   System.out.println("x = " + this.x + ", y = " + this.y);
		   
		// call the add() method passing this as argument
		   add(this);
		   
		   // value of x and y after calling add()
		   System.out.println("Before passing this to addTwo() method:");
		   System.out.println("x = " + this.x + ", y = " + this.y);
		   
		   
	   }
	   
	   void add(program3 o) {
		   
		   o.x += 2;
		   o.y -= 5;
	   }

}
