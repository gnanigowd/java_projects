package practice_que;

import java.util.Scanner;

public class Contruction {
	public static void main(String[]args) {
	Scanner sc = new Scanner(System.in);
	Student s1 = new Student();
	System.out.println("enter a age");
	s1.age = sc.nextInt();
	System.out.println("enter a Rollnumber");
	s1.Rollnumber = sc.nextInt();
	System.out.println("enter a std");
	s1.std=sc.nextInt();
	System.out.println("enter a height");
	s1.Height=sc.nextInt();
	sc.nextLine();
	System.out.println("enter a name");
	s1.name = sc.nextLine();
	System.out.println(s1.age + "\t" + s1.Rollnumber + "\t"+ s1.Height + "\t" + s1.name);
	
			
	}

}
	//Scanner sc = new Scanner(System.in);
	//Student s1 = new Student();
	//System.out.println("enter a age");
	//s1.age = Integer.parseInt(sc.nextInt);
	//System.out.println("enter a Rollnumber");
	//s1.Rollnumber = Integer.parseInt(sc.nextInt);
	//System.out.println("enter a std");
	//s1.std=Integer.parseInt(sc.nextInt);
	//System.out.println("enter a height");
	//s1.Height=Integer.parseInt(sc.nextInt);
	//sc.nextLine();
	//System.out.println("enter a name");
	//s1.name = Integer.parseInt(sc.nextLine);
	//System.out.println(s1.age + "\t" + s1.Rollnumber + "\t"+ s1.Height + "\t" + s1.name);
	//}
//}

	