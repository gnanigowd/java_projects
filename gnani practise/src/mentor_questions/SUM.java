package mentor_questions;

import java.util.Scanner;

public class SUM {
	public static void main(String[] args) {
		int sum = 0;
		for (int i = 1; i <= 10; i++) {
			Scanner sc = new Scanner(System.in);
			System.out.println("ENTER ANY NUMBER");
			int number = sc.nextInt();
			sum = sum + number;
		}
		

			System.out.println(sum);

		}
	
	}
	

