package mentor_questions;

import java.util.ArrayList;
import java.util.Scanner;

public class Sum_Digits {

	public static void main(String[] args) {
		int sum = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter any number");
		int num = sc.nextInt();
		for (int i = 1; i > 0; i++) {
			if (num > 0) {
				i = num % 10;
				num = num / 10;
				sum = sum + i;	
		}
		}
		System.out.println(" sum of digits" + sum);
	}
	}
