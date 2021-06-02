package stringPrograms;

public class formatProgram {
	
	public static void main(String[] args) {
        String a1 = String.format("%d", 125);            
        String a2 = String.format("%s", "studytonight");  
        String a3 = String.format("%f", 125.00);        
        String a4 = String.format("%x", 125);            
        String a5 = String.format("%c", 'a');  
        System.out.println("Integer Value: "+a1);  
        System.out.println("String Value: "+a2);  
        System.out.println("Float Value: "+a3);  
        System.out.println("Hexadecimal Value: "+a4);  
        System.out.println("Char Value: "+a5);  
    }

}
