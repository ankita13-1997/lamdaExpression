package Typical;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class ValidationFinal {
	static Scanner sc= new Scanner(System.in);
	static boolean exit=false;
	
		void CheckName(){
			
			System.out.println("enter your name");
			System.out.println("please enter the[1] first letter in captical[2]input of min 5 letter and maximum 10 is accepted");
			System.out.println();
			String firstName=sc.next(); 
			
			String regex="[A-Z]{1}[a-z]{2,10}$";
			Pattern p = Pattern.compile(regex);
			
			 Matcher m = p.matcher(firstName);
			 boolean m1=m.matches();
			 System.out.println(m1);
			
			 if (m1==false)
			 {
				 
				 System.out.println("invalid inputs in name please renter in the correct format");
				 
			 }
			 
			 else
			 {
				 System.out.println("your name "+firstName);
			 }
			
		}

		
		
		
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
		
		void checkpassword() 
		{
			// TODO Auto-generated method stub
			System.out.println("enter the password");
			System.out.println("password must have atleast 1.one upper case 2.lower case 3.one special character like @ # & $"
					            + " 4. 1 numberic character 4.length of password minimum be 4 maximum be 10" );
			System.out.println("warning you can only take 5 attempts only");
			 int count=0;
			for(int i= 0; i<5 ; i++)
			{
			    String password=sc.next();
			    String regex="^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#&$])(?=\\S+$).{4,10}$";
				Pattern p = Pattern.compile(regex);
				
				 Matcher m = p.matcher(password);
				 boolean m1=m.matches();
				 System.out.println(m1);
				count+=1;

				 if (m1==false)
				 {
					 
					 System.out.println("invalid inputs for password please renter in the correct format");
					 System.out.println("you hav used "+count+ " from maximun 5 attempts");
					 continue;
					 
				 }
				 
				 else
				 {
					 System.out.println("your password "+password);
					
					 System.out.println("please Re-enter the correct password");
					 String password2=sc.next();
					 if(password2.contains(password))
					 {
						 System.out.println("you have succesfully set your password and made an account");
						
					 }
					 else
					 {
						 System.out.println("enter the password again");
						 continue;
					 }
					 break;
				 }
				
			}
				
			   
		}
		
		
		
		
		
		void FirstLamda()
		{
			 String regex="[A-Z]{1}[a-z]{2,10}$";
		 	 ArrayList <String> First_Name=new ArrayList<String>();
			//String mail1=sc.next();
			System.out.println("enter number of input you wanna to give");
			int n1=sc.nextInt();
			for(int i=0; i<n1 ; i++) {
				First_Name.add(sc.next());
			}
			System.out.println(First_Name.toString());
			Pattern pt = Pattern.compile(regex);
			
			//Predicate <String> mailcheck =Pattern.compile(regex).asPredicate();
		    List<String> a1= First_Name. stream(). filter(p -> pt. matcher(p). find()). collect(Collectors.<String>toList());
			//List<String> emails1= mail.stream().filter(mailcheck).collect(Collectors.<String>toList());
			System.out.println(a1);
			
		}
		
		
		
		void LastLamda()
		{
			 String regex="[A-Z]{1}[a-z]{2,10}$";
		 	 ArrayList <String> Last_Name=new ArrayList<String>();
			//String mail1=sc.next();
			 System.out.println("enter number of input you wanna to give");
			 int n1=sc.nextInt();
			 for(int i=0; i<n1 ; i++) {
				Last_Name.add(sc.next());
			}
			System.out.println(Last_Name.toString());
			Pattern pt = Pattern.compile(regex);
			
			//Predicate <String> mailcheck =Pattern.compile(regex).asPredicate();
		    List<String> a1= Last_Name. stream(). filter(p -> pt. matcher(p). find()). collect(Collectors.<String>toList());
			//List<String> emails1= mail.stream().filter(mailcheck).collect(Collectors.<String>toList());
			System.out.println(a1);
			
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
		
		
		
		
		void PasswordLamda()
		{
			 String regex="^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#&$])(?=\\S+$).{4,10}$";
		 	 ArrayList <String> password=new ArrayList<String>();
			//String mail1=sc.next();
			 System.out.println("enter number of input you wanna to give");
			 int n1=sc.nextInt();
			 for(int i=0; i<n1 ; i++) {
				password.add(sc.next());
			}
			System.out.println(password.toString());
			Pattern pt = Pattern.compile(regex);
			
			//Predicate <String> mailcheck =Pattern.compile(regex).asPredicate();
		    List<String> a1= password. stream(). filter(p -> pt. matcher(p). find()). collect(Collectors.<String>toList());
			//List<String> emails1= mail.stream().filter(mailcheck).collect(Collectors.<String>toList());
			System.out.println(a1);
			
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
		
		
		 static void end()
         {
      	System.out.println("thank you");
				exit=true;
         }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		while(!exit)
		{
		Scanner s=new Scanner(System.in);
         System.out.println("enter your choice to fill the details for registrartion");
        
         System.out.println("1. Enter for First name");
         System.out.println("2. Enter for Last name");
         System.out.println("3. Enter for Contact Number");
         System.out.println("4. Enter for Email Address");
         System.out.println("5. Enter for Password");
         System.out.println();
         System.out.println("6. Enter for First name through lamda function");
         System.out.println("7. Enter for Last name through lamda function");
         System.out.println("8. Enter for Contact Number through lamda function");
         System.out.println("9. Enter for Email Address through lamda function ");
         System.out.println("10. Enter for Password through lamda function");
         System.out.println();
         
         System.out.println("11. Finish And Exit ");
         int choice=s.nextInt();
         
         switch(choice)
         
         {
         case 1:
        	 
        	 new ValidationFinal().CheckName();
        	 break;
        	 
         case 2:
        	 
        	 new ValidationFinal().CheckName();
        	 break;
        	 
         case 3:
        	 
        	 new ValidationFinal().checkno();
        	 break;
        	 
         case 4:
        	 new ValidationFinal().checkemail();
        	 
        	 break;
        	 
         case 5:
        	 
        	 new ValidationFinal().checkpassword();
        	 break;
        	 
        	 
         case 6 :
        	 new ValidationFinal().FirstLamda();
        	 break;
        	 
         case 7 :
        	 new ValidationFinal().LastLamda();
        	 break;
         
         case 8:
        	 new ValidationFinal().PhoneLamda();
        	 break;
         case 9 :
        	 new ValidationFinal().emailLamda();
        	 break;
        	 
         case 10 :
             new ValidationFinal().PasswordLamda();
        	 break;
        	 
         case 11:
        	 end();
        	 break;
        
        		  
         }
		}
  	}

}
