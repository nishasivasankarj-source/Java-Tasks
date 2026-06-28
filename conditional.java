package learn_java;

import java.util.Scanner;

public class conditional {

	public static void main(String[] args) {
	  
		//conditional statements
	     
		// 1.write a java program to accept two numbers m and n where m>n,and find the quotient and remainder.
		     
		     int m = 30;
		     int n = 20;
		     if(m>n){
		     System.out.println("quotient:"+m/n);
		     System.out.println("remainder:"+m%n);
		     }
		     else {

             System.out.println("m in greater than n");
	}
      
		     
	//2.write a java program to accept five subject marks and display the grade based on the average.
		     
		     
		     int m1 = 97;
		     int m2 = 90;
		     int m3 = 80;
		     int m4 = 75;
		     int m5 = 70;
		     
		   int average = ((m1 + m2 + m3 + m4 + m5)/5) ;
		   System.out.println("average:"+average);
		   if(average >=97) {
		    System.out.println("Grade A");
		   }
		    else if(average >=90) {
		     System.out.println("Grade A");
		    }
		    else if(average >=80) {
		     System.out.println("Grade B");
		    }
		    else if(average >=75) {
		     System.out.println("Grade C");
		    }
		    else if(average >=70) {
		    	System.out.println("Grade D");
		    }
		    else {
		    	System.out.println("fail");
		    }
		  

		    
	//3.a.whether a number is positive or negative 
        
     int num1 = 50;
     int num2 = -70;
     if(num1>=0) {
        System.out.println("positive");
     }
     else {
    	System.out.println("negative");
     }
     
     
    //3.(b) whether a number is odd or even
     
     int a = 12;
     if(a%2== 0){
      System.out.println("a is even number");
     }
     else {
    	 System.out.println("a is odd number");
    	 
     }
     
     
     //3.(c) whether a student pass or fail based on marks.
     
       int b = 70;
       
       if(b>=10) {
    	   System.out.println("pass");
       }
       else {
    	   System.out.println("fail");
       }
       
       
     //3.(d).year is a leap year or not.
       
        n = 2005;
        if(n %4 ==0) {
         System.out.println(n+" is leap year ");
        }
        else {
         System.out.println(n+" is not a leap year");
        	
        }
     
     
 
     //4.whether a character is a vowel or consonant.
     
       char	ch = 'i';
    	
    	if(ch =='a'|| ch == 'e' || ch =='i' || ch =='o'|| ch =='u') {
    	  System.out.println( "vowel");
    	}
    	  else  {
    	  System.out.println("consonant");
    	  }
    	
    //5.To find the maximum and minimum among three numbers.
    	
    	int c= 10;
    	int d = 15;
    	int e= 20;
    	
    	if(c>=d && d>=e) {
    		System.out.println("minimum:"+c);
    	}
    	else if(d>=e && e>c) {
    		System.out.println("maximum:"+d);
    	}
        
    	else if(c>=e && d>=e) {
    		System.out.println("maximum:"+e);
    	}
    	
    	else {
    		System.out.println("maximum:"+e);
    	}
		  
    	int f= 2;
    	int g = 5;
    	int h= 10;
    	
	
  
    	if(f>=g && g>=h) {
    		System.out.println("minimum:"+f);
    	}
    	else if(g>=h && h>f) {
    		System.out.println("minimum:"+g);
    	}
        
    	else if(f>=h && g>=h) {
    		System.out.println("minimum:"+h);
    	}
    	
    	else {
    		System.out.println("minimum:"+h);
    	}

    	
    	
    	
    	
//    	int n1 = 97;
//    	char b1 = (char) n1;
//    	
//    	System.out.println(b1);
//


    	//6.To display the season based on the given month.
    	
    	Scanner scan = new Scanner(System.in);

    	System.out.print("Enter the Month : ");
    	String mon = scan.next();
    	
    	if(mon.equals("march") || mon.equals("april") || mon.equals("april")) {
    		System.out.println(mon+" is spring season..");
    	}
    	else if(mon.equals("june") || mon.equals("july") || mon.equals("aguest")) {
    		System.out.println(mon+" is summer season..");
    	}
         
    	else if(mon.equals("september") || mon.equals("october") || mon.equals("november")) {
    		System.out.println(mon+" is autumn season..");
    	}  
           
    	else if(mon.equals("december") || mon.equals("january") || mon.equals("feburary")) {
    		System.out.println(mon+" is winter season..");
    	}
       
    	else {
    		System.out.println("invalid month");
    	}
          
    	
    	//7.to find the number of days in a given month.
    	
    	Scanner Scan  = new Scanner(System.in);
    	
    	System.out.print("Enter the month :");
    	String month = scan.next();
    	
    	if(mon.equals("september")) {
    	 System.out.println(month+" is 30 days");
    	 
    	}
    	
    	else if (month.equals("october")) {
    	System.out.println(month+" is 31 days");
    		
    	}
    	else {
    		System.out.println(month+ " is 28 days");
    	}
    			
     }
     }










