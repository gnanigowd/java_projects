package mentor_questions;

import java.util.Scanner;

public class Largest_smallest {
	int i = 1;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter any number");
		int[] j = new int[10];
		int max = j[0];

		for (int i = 1; i < j.length; i++) {
			System.out.println();
			j[i] = sc.nextInt();
		}
		System.out.println("array is ");

		for (int i = 0; i < j.length; i++) {
			if (j[i] > max) {
				j[i] = max;

				for (int var = 0; var < j.length; var++) {

					System.out.println(j[max]);

					System.out.println("given array " + j[max]);

				}

			}
		}
	}
}
