package mentor_questions;

import java.util.Scanner;

public class Product_Sum {

public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.println("enter any number");
int []j = new int[5];
int sum = 0;
int product = 1;
for (int i = 0; i < j.length; i++) {
	System.out.println();
	j[i] = sc.nextInt();
}
	

for (int i = 0; i < j.length; i++) {
	System.out.println(" the stored list is j[" + i +"] " +  j[i]);
	sum= sum+ j[i];
	product = product*j[i];
}
System.out.println(sum   +  "sum");
System.out.println(product + "product");
}
}