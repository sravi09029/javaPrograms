package stringTokenizerPrograms;

import java.util.StringTokenizer;

public class Demo {

	public static void main(String[] args) {
			
		StringTokenizer obj = new StringTokenizer("Welcome to java");
		while(obj.hasMoreTokens()) {
			System.out.println(obj.nextToken());
			//System.out.println("---------------------");
			//System.out.print(obj. nextToken());
		}
	}

}
