package sample2;

import java.util.Scanner;

public class Vowel_Question {
	public static void main(String[]args) {
		Scanner sc= new Scanner(System.in);
		char ch;
		System.out.println("enter a character");
		ch = sc.next().charAt(0);
		if (ch =='a' || ch =='e' || ch=='i'|| ch=='o' || ch=='u') {
			System.out.print(ch + " is an vowel ");
		}
			
		else {
			System.out.print(ch + " is not vowel");
			
		}
		
	}
}

