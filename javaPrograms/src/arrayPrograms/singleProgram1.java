package arrayPrograms;

public class singleProgram1 {

	public static void main(String[] args) {
		
		int[] arr = {20,40,30,60,50};
		
		for(int i = 0; i<arr.length;i++) {
			
			System.out.println("arry index value is: "+arr[i]);
		}
		
		arr[2]   = 200;
		System.out.println("element at third index: "+arr[2]);
	}

}
