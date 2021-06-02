package arrayPrograms;

public class jaggedArray {

	public static void main(String[] args) {
			
		int[][] arr = {{1,6,7},{2,8},{7,8,5,9}};
		
		//row identidied
		for(int i = 0; i<3; i++) {
			
			//column identified
			for(int j = 0; j<arr[i].length;j++) {
				
				System.out.print(arr[i][j]+"  ");
			}
			
			System.out.println();
			 
		}
	}

}
