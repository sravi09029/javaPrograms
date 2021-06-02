package stringPrograms;

public class joinProgram {

	public static void main(String[] args) {
		String s = String.join("*", "Welcome to studytonight.com");
		System.out.println(s);
		String date1 = String.join("/", "23", "01", "2020");
		System.out.println("Date: " + date1);
		String time1 = String.join(":", "2", "39", "10");
		System.out.println("Time: " + time1);
	}

}
