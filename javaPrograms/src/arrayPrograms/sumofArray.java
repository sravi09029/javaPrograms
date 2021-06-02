package arrayPrograms;

public class sumofArray {

	public static void main(String[] args) {

		int[] arr = { 1, -5, 6, 7, 8, 9, -10, 20, 30, 24, 100 };

		int sum = 0;

		Double average;

		for (int number : arr) {
			sum += number;
			System.out.println("sum value is: " + sum);
		}
		
		int  arrlength = arr.length;
		
		//convert the average
		//convert the average from into double;
		average = ((double)sum/(double)arrlength);
		
		System.out.println("Sum = "+sum);
		System.out.println("Average = "+average);
	}

}
