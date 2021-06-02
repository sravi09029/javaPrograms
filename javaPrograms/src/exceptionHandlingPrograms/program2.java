package exceptionHandlingPrograms;

public class program2 {
	
	static void sum(int a,int b) throws program1
	  {
	    if(a<0)
	    {
	      throw new program1(a); //calling constructor of user-defined exception class
	    }
	    else
	    {
	      System.out.println(a+b);
	    }
	  }
	

	public static void main(String[] args) {

		try
	    {
	      sum(-10, 10);
	    }
	    catch(program1 me)
	    {
	      System.out.println(me); //it calls the toString() method of user-defined Exception
	    }

	}

}
