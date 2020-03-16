package mento;

import java.util.Scanner;

public class Perfect_square {

	public static void main(String[] args) {
		int sum = 0;

		Scanner sc = new Scanner(System.in);
		System.out.println("enter any number");
		int Number = sc.nextInt();
		for (int i = 1; i < Number; i++) {
			if (Number % i == 0) {
				sum = sum + i;
			}
		
		}
		if (Number == sum) {
				System.out.println("it is a perfect number" + Number);

		} else {
				System.out.print("it is not a perfect number");
				}

	}
}
