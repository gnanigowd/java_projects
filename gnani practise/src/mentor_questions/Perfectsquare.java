package mentor_questions;

import java.util.Scanner;

public class Perfectsquare {

	public static void main(String[] args) {
		Scanner sc =  new Scanner (System.in);
		System.out.println("ENTER ANY NUMBER");
		int number = sc.nextInt();
		int  square,number1,root;
		
		root =( int)Math.sqrt(number);
		square = root*root;
	
	


	if (square==number) {
			
	System.out.println(number + "it is a perfect square ");
	}else{
		System.out.println("It is not a perfect number");

}}

}
