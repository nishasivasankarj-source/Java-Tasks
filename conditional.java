package learn_java;

import java.util.Scanner;

public class conditional {

public static void main(String[] args) {
	  
		//conditional statements
	     
// 1.write a java program to accept two numbers m and n where m>n,and find the quotient and remainder.
		     
//		     int m = 30;
//		     int n = 20;
//		     if(m>n){
//		     System.out.println("quotient:"+m/n);
//		     System.out.println("remainder:"+m%n);
//		     }
//		     else {
//
//             System.out.println("m in greater than n");
//	}
      
//2.accept five subject marks and display the grade based on the average
//	Scanner sc = new Scanner(System.in);
//	int sum = 0;
//	System.out.println("enter 5 subjects marks:");
//	for(int i=0;i<=5;i++) {
//		sum+=sc.nextInt();
//	}
//	
//   double avg = sum/5.0;
//   System.out.println("Average = "+avg);
//   if(avg>=90)
//	   System.out.println("Grade A");
//   else if(avg>=75)
//	   System.out.println("Grade B");
//   else if(avg>=60)
//	   System.out.println("Grade C");
//   else if(avg>=50)
//	   System.out.println("Grade D");
//   else if(avg>=55)
//	   System.out.println("Grade E");

		


//      3.(a). whether a number is positive or negative
		  
//		  Scanner Sc = new Scanner(System.in);
//		  System.out.println("enter a number:");
//		  int number = Sc.nextInt();
//		  
//		  if(n>0) {
//			  System.out.println("positive");
//		  }
//			  else if(n<0) {
//				  System.out.println("negative");
//			  }
//				  else 
//					  System.out.println("zero");
//	
  //3.(b).whether a number is odd or even
		  
//		  Scanner sc = new Scanner(System.in);
//		  System.out.println("enter a number:");
//		  int num= sc.nextInt();
//		  
//		  if(number%2==0) {
//			  System.out.println("even");
//		  }
//			  else 
//				 System.out.println("odd");		  
//		  
			  
				  
   //3.(c) whether a student pass or fail based on marks.
     
//       int b = 70;
//       
//       if(b>=10) {
//    	   System.out.println("pass");
//       }
//       else {
//    	   System.out.println("fail");
//       }
//      
       
   //3.(d).year is a leap year or not.
       
//        Scanner sc=new Scanner(System.in);
//        System.out.println("enter year");
//        int year = sc.nextInt();
//        if((year %2005 ==0)||(year %5==0&& year % 100!=0)) {
//        	System.out.println("leap year");
//        	
//        		System.out.println("not a leap year");
//        }

     
//4.whether a character is a vowel or consonant.
	
//	Scanner sc = new Scanner(System.in);
//	System.out.println("enter a characte:");
//	char ch = sc.next().charAt(0);
//	if(ch=='a'|| ch == 'e'|| ch == 'i'|| ch == 'o' || ch =='u'||
//			ch =='A'|| ch =='E'|| ch == 'I'|| ch == 'O'|| ch=='U')
//		System.out.println("vowel");
//	else 
//		System.out.println("consonant");
//     


    	
    //5.To find the maximum and minimum among three numbers.
    	
//    	int c= 10;
//    	int d = 15;
//    	int e= 20;
//    	
//    	if(c>=d && d>=e) {
//    		System.out.println("minimum:"+c);
//    	}
//    	else if(d>=e && e>c) {
//    		System.out.println("maximum:"+d);
//    	}
//        
//    	else if(c>=e && d>=e) {
//    		System.out.println("maximum:"+e);    	}
//    	
//    	else {
//    		System.out.println("maximum:"+e);
//    	}
	  
//    	int f= 2;
//    	int g = 5;
//    	int h= 10;
//    	
//	
//  
//    	if(f>=g && g>=h) {
//    		System.out.println("minimum:"+f);
//    	}
//    	else if(g>=h && h>f) {
//    		System.out.println("minimum:"+g);
//    	}
//        
//    	else if(f>=h && g>=h) {
//    		System.out.println("minimum:"+h);
//    	}
//    	
//    	else {
//    		System.out.println("minimum:"+h);
//    	}

    	
    //6.to display the season based on the given month and day 	
    	
//    	Scanner scan = new Scanner(System.in);
//
//    	System.out.print("Enter the Month : ");
//    	String mon = scan.next();
//    	
//    	if(mon.equals("march") || mon.equals("april") || mon.equals("april")) {
//    		System.out.println(mon+" is spring season..");
//    	}
//    	else if(mon.equals("june") || mon.equals("july") || mon.equals("aguest")) {
//    		System.out.println(mon+" is summer season..");
//    	}
//         
//    	else if(mon.equals("september") || mon.equals("october") || mon.equals("november")) {
//    		System.out.println(mon+" is autumn season..");
//    	}  
//           
//    	else if(mon.equals("december") || mon.equals("january") || mon.equals("feburary")) {    		
//    	}
//       
//    	else {
//    		System.out.println("invalid month");
//    	}
          
    	
    	//7.to find the number of days in a given month.
   	
//    	Scanner Scan = new Scanner(System.in);
//    	
//    	System.out.print("Enter the month (1-12) :");
//    	int month = Scan.nextInt();
//    	
//    	if(month==2) {
//    	 System.out.println("28 or 29 days");
//    	 
//    	}
//    	
//    	else if (month==4 ||month==6||month==9||month==11) 
//    	System.out.println(month+" is 30 days");
//    		
//    	
//    	else 
//    		System.out.println(month+ " is 31 days");
//    	
    	
   
 //8.To display "hello" if the number entered by the user is a multiple of 5,otherwise print "bye".
	
//	   Scanner sc = new Scanner(System.in);
//	   System.out.println("enter a number:");
//	   int n = sc.nextInt();
//	   
//	   if(n % 5==0) {
//		   System.out.println("Hello");
//	   }
//	   
//	   else
//		   System.out.println("Bye");
//	   

//9.To accept the temperature in degree celsius and check whether water is boiling or not.
	
//	Scanner sc = new Scanner(System.in);
//	System.out.println("enter temperature in celsius:");
//    	int temp = sc.nextInt();
//    	if(temp>=100) {
//    		System.out.println("water is boiling");
//    	}
//    	else
//    		System.out.println("water is not boiling");
//     
      	  
//10.To calculate the library charge based on the number of days.
	
//	Scanner sc = new Scanner(System.in);
//	System.out.println("Enter number of days:");
//	int days = sc.nextInt();
//	int charge;
//	if(days<=5) {
//		charge = days*2;
//	}
//	else if (days<=10) {
//		charge = days*3;
//	}
//	else if(days<=15) {
//		charge = days*4;
//	}
//	else {
//		charge = days*5;
//	}	
//	System.out.println("library charge = rs"+charge);
			


    	
    
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
	}
}
    	
     
	
     
    		 
     	 
     

  
      
      

      






