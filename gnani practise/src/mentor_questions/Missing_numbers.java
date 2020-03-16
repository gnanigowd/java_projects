package mentor_questions;

public class Missing_numbers {

	public static void main(String[] args) {
		int[] a = { 1, 2, 3,4,5,6,7,8,9,10,12,13,14,15,16,17,18,19,20};
		int listnumbers = a.length+1;
		int totalsum = (listnumbers*(listnumbers+1)/2);
		int sum =0;
		for (int i = 0;i<a.length;i++) {
			sum = sum+ a[i];
			
		}
		System.out.println("missing number is " + (totalsum+-sum));
		

	}

}
