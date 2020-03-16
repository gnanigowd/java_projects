package mentor_questions;

import java.util.Scanner;

public class Sum_Average {

	public static void main(String[] args) {
		int product = 0;
		int sum = 0;
		int average = 0;
		for (int i = 1; i <= 10;i++) {
			Scanner sc = new Scanner (System.in);
			System.out.println("enter any number");
			int num = sc.nextInt();
			sum = sum + num;
			product = product+1;
			average = average + 1;
	}
		System.out.println(sum);
		System.out.println(" sum" + " "+ sum);
		average = (sum / average);
		System.out.println("average " + " "+ average);
		product=sum*product;
		System.out.println(" product "  + " " +product);
	}
}
