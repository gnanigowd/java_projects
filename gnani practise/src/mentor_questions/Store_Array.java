package mentor_questions;

import java.util.Scanner;

public class Store_Array {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter any number");
		int []j = new int[10];
		for (int i = 0; i < j.length; i++) {
			System.out.println();
			j[i] = sc.nextInt();
		}
		for (int i = 0; i < j.length; i++) {
			System.out.println(" the stored list is j[" + i +"] " +  j[i]);
		}
	}
}

