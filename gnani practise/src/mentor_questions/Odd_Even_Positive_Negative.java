package mentor_questions;

import java.util.Scanner;

public class Odd_Even_Positive_Negative {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] j = new int[20];
		int postive = 0;
		int negative = 0;
		int odd = 0;
		int even = 0;
		for (int i = 0; i < j.length; i++) {
			System.out.println("ENTER ANY NUMBER");
			
			j[i] = sc.nextInt();
			if (j[i] > 0) {
				postive = postive + 1;
			}
			else if (j[i]<=0) {
			negative = negative+1;
			}
			if (j[i] % 2 == 0) {
					
					even = even + 1;
				}
		else {
					odd++;		
		  }
}
		System.out.println(postive + " count of  positive numbers");
		System.out.println(negative + " count of negative numbers");
		System.out.println(even + "count of even numbers");
		System.out.println(odd + " count of  odd numbers ");

	}
	}

	
	
	

