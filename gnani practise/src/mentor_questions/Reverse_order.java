package mentor_questions;

import java.util.Scanner;

public class Reverse_order {

	public static void main(String[] args) {
		int rem = 0 ,reverse = 0,sum=0;
		Scanner sc = new Scanner (System.in);
		System.out.println("enter any number");
		int num = sc.nextInt();
	   while (num!=0) {
	   rem=num%10;
	   reverse= reverse*10+rem;
		num = num/10;
	   }
			

	
	   System.out.println(reverse);


}	
}


