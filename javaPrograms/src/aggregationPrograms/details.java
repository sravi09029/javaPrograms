package aggregationPrograms;

public class details {
	
	 String name;
	 int id;
	 Student student; // student call 
	 
	  details(String p,int d,Student student){
		  
		  this.name = p;
		  this.id = d;
		  this.student = student;
	  }

	public static void main(String[] args) {
		
		Student obj = new Student(100, "ravikumar", 10000);
		details obj1 = new details("Raveendra", 200, obj);
		
		System.out.println("details: "+obj.name);
		System.out.println("details: "+obj.fee);
		//System.out.println("details: "+obj.id);
		System.out.println("----------Student details-------------------");
		System.out.println("Student id: "+obj1.student.student_id);
		System.out.println("Student id: "+obj1.student.name);
		System.out.println("Student id: "+obj1.student.fee);
		
		
	}

}
