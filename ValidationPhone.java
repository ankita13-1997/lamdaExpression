package Typical;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class ValidationPhone {
	Scanner sc=new Scanner(System.in);
	void checkno() {
		// TODO Auto-generated method stub
		    System.out.println("enter the phone number");
		    System.out.println("number should valid its country code as +91 and must be of 9 digit number");
		    String phone=sc.next();
		    String regex="[91]{2}[0-9]{9}";
			Pattern p = Pattern.compile(regex);
			
			 Matcher m = p.matcher(phone);
			 boolean m1=m.matches();
			 System.out.println(m1);
			 if (m1==false)
			 {
				 
				 System.out.println("invalid inputs in name please renter in the correct format");
				 
			 }
			 
			 else
			 {
				 System.out.println("your contact number "+phone);
			 }
		
	}
	
	void PhoneLamda()
	{
		String regex="[91]{2}[0-9]{9}";
	 	 ArrayList <String> phone_no=new ArrayList<String>();
		//String mail1=sc.next();
		 System.out.println("enter number of input you wanna to give");
		 int n1=sc.nextInt();
		 for(int i=0; i<n1 ; i++) {
			phone_no.add(sc.next());
		}
		System.out.println(phone_no.toString());
		Pattern pt = Pattern.compile(regex);
		
		//Predicate <String> mailcheck =Pattern.compile(regex).asPredicate();
	    List<String> a1= phone_no. stream(). filter(p -> pt. matcher(p). find()). collect(Collectors.<String>toList());
		//List<String> emails1= mail.stream().filter(mailcheck).collect(Collectors.<String>toList());
		System.out.println(a1);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ValidationPhone().checkno();
	}

}
