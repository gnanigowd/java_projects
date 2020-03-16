package practice_question;

public class Star_Print2 {
	static void main(String[]args){
		int i=1;
		int j=1;
		while (i<=7) {
			while (j<=i) {
				System.out.print("*");
				j=j+1;
			
			}
			System.out.print("/n");
			i=i+1;
			
			
		}
	}
}
