package exceptionHandlingPrograms;

public class program1 extends Exception{
	
	private int ex;
	program1(int a)
	  {
	    ex = a;
	  }
	  public String toString()
	  {
	    return "MyException[" + ex +"] is less than zero";
	  }

}
