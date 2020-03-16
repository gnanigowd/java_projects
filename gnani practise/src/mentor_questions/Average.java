package mentor_questions;

import java.util.Scanner;

public class Average {

	public static void main(String[] args) {
		int sum = 0;
		int average = 0;
		for (int i = 1; i <= 10; i++) {
		Scanner Sc = new Scanner(System.in);
		System.out.println("enter any number");
		int Number = Sc.nextInt();
		
			sum = sum + Number;

			average = average + 1;

		}
		System.out.println( "sum" +   sum);
		average = (sum / average);
		System.out.println("average" + average);
	}

}
