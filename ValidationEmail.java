package Typical;
import java.util.*; 
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.function.Predicate;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class ValidationEmail {
	Scanner sc= new Scanner(System.in);
	
	
	void checkemail()
	{
		System.out.println("Enter your Email");
		System.out.println("[1]email must have domain name and .with it [2] must have a @ in Your input");
		String email=sc.next();
		    String regex="[a-zA-Z0-9_.]+@[a-zA-Z.]+$";
			Pattern p = Pattern.compile(regex);
			
			 Matcher m = p.matcher(email);
			 boolean m1=m.matches();
			 System.out.println(m1);
		
			 if (m1==false)
			 {
				 
				 System.out.println("invalid inputs for email please renter in the correct format");
				 
			 }
			 
			 else
			 {
				 System.out.println("your email is "+email);
			 }
			
			
		
		
		
	}
	
	void emailLamda()
	{
		 String regex="[a-zA-Z0-9_.]+@[a-zA-Z]+.[a-zA-Z]+$";
		ArrayList <String> mail=new ArrayList<String>();
		//String mail1=sc.next();
		System.out.println("enter number of input you wanna to give");
		int n1=sc.nextInt();
		for(int i=0; i<n1 ; i++) {
			mail.add(sc.next());
		}
		System.out.println(mail.toString());
		Pattern pt = Pattern.compile(regex);
		
		//Predicate <String> mailcheck =Pattern.compile(regex).asPredicate();
	    List<String> a1= mail. stream(). filter(p -> pt. matcher(p). find()). collect(Collectors.<String>toList());
		//List<String> emails1= mail.stream().filter(mailcheck).collect(Collectors.<String>toList());
		System.out.println(a1);
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//new ValidationEmail().checkemail();
         new ValidationEmail().emailLamda();
	}

}
