package loops;

public class program2 {

	public static void main(String[] args) {
			
		int arr[] = {10,20,30,3,5};
		
		int i = 0;
		while(i<5) {
			
			if(i==1){
				i++;
				continue;
				//break;
			}
			
			System.out.println(arr[i]);
			i++;
			
		}
	}

}
