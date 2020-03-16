package converting;

import java.util.Scanner;

public class Length_Function {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number");
		int n = sc.nextInt();
		int length = 0;
		int temp = 1;
		while (temp <= n) {
		    length++;
		    temp  *=10;
		}
		System.out.println (length);
	}

} 
