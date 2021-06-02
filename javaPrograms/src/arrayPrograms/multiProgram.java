package arrayPrograms;

public class multiProgram {

	public static void main(String[] args) {
			
		int[][] arr = {{1,4,6,2,6},{20,40,10,28,90},{30,50,52,66,78}};
		
		for(int i  = 0; i<3;i++) {
			
			for(int j=0;j<arr[i].length;j++) {
				
				System.out.print(arr[i][j]+" ");
			}
			
			System.out.println();
		}
	}

}
