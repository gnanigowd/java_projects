package college_departments;

import java.util.ArrayList;
import java.util.Scanner;

public class Student_list {

	public static void main(String[] args) {
		Scanner var1 = new Scanner(System.in);
		System.out.println("WELCOME TO NAVGURUKUL");
		String user = "yes";
		String response=null;
		ArrayList<String> mylist = new ArrayList<String>();

		while (true) {
			if (user.equals("yes")) {
				ArrayList list1=new ArrayList();
				System.out.println("enter name of the student");
				String username = var1.nextLine();
				list1.add(username);
				System.out.println("enter DOB");
				String userDOB = var1.nextLine();
				list1.add(userDOB);
				System.out.println("PHN NUM");
				String userPHNNUM = var1.nextLine();
				list1.add(userPHNNUM);
				System.out.println("STUDENT ID");
				String userID = var1.nextLine();
				list1.add(userID);
				System.out.println("  DEPARTMENTS " + "   CSE  " + "  EEE  " + "  MECH  ");
				String userDEPARTMENTS = var1.nextLine();
				list1.add(userDEPARTMENTS);
				System.out.println(list1);
				if (mylist.size() == 0) {
					mylist.addAll(list1);
				}else if (mylist.size()!=0) {
					for ( String i: mylist) {
					if (i.contains(mylist.get(1)) && i.contains(mylist.get(3))) {
						System.out.println("already register");
						response = "red";
						break;
					}else {
						response = "green";
					}
						
					}
					
				}else if (response=="green") {
					mylist.addAll(list1);
					

				
			} else {
				System.out.println("THANK YOU DEAR");
				break;
			}
			System.out.println("do you need more information");
			
			String user1 = var1.nextLine();
			user = user1;
			
		}

	}

	}
	}
