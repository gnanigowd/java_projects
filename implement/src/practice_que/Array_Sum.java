package practice_que;

import java.util.Scanner;

public class Array_Sum {
	public static void main (String[]args) {
        Scanner sc = new Scanner(System.in);
        int n, sum = 0;
        System.out.print("Enter no. :");
        n = sc.nextInt();
        int a[] = new int[n];
        for(int i = 0; i < n; i++)

        {
            a[i] = sc.nextInt();
            sum = sum + a[i];

        }
        System.out.println("Sum of element:"+sum);
	}
}

