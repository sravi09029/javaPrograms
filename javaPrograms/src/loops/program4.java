package loops;

public class program4 {

	public static void main(String[] args) {

		int i = 20;

		do { 
			
			if(i==10) {
				
				i++;
				break;
			}

			System.out.println(i);
			i--;
		} while (i > 0);
	}

}
