package learn.java;

public class string_practices {

	public static void main(String[] args) {
		
//		   1. print a string
		
//			String str = " Nisha ";
//			System.out.println(str);

//			2. print each character of a string
			
//			String str = " Poorna ";
//			for(int i=0; i<str.length(); i++) {
//				System.out.print(str.charAt(i));
//			}
			
//			3. count the total number of character in a string
			
//			String str = "Harsha";
//			System.out.println("total character = "+ str.length());
			
//			4. reverse a string
			
//			String str = "welcome";
//			for(int i=str.length()-1;i>=0;i--) {
//				System.out.println(str.charAt(i));
//				
//			}
			
			//5.check whether a string is palindrome 
			
//			String str = "madam";
//			System.out.println(str);
//			if(str.equals("madam")) {
//				System.out.println("palindrome");
//			}
//			else {
//				System.out.println("not palindrome");
//			}
			
			//6.count the number of vowels
			
//			String str ="Nisha";
//			int count = 0;
//			for(int i=0;i<str.length();i++) {
//				char ch = Character.toLowerCase(str.charAt(i));
//				if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
//					count++;	
//				}
//			   
//			}
//			System.out.println("vowels= "+count);
			
			//7.count the number of consonants
			
//					String str = "Nisha";
//					int count = 0;
//					for(int i=0;i<=str.length();i++) {
//						char ch = Character.toLowerCase(str.charAt(i));
//						if(ch =='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
//							count++;
//						}
//					}
//					System.out.println("consonant="+count);
					
	//8.count the numbers of uppercase letters
		
//		String str = "NISHA";
//		int count = 0;
//		
//		for(int i=0;i<str.length();i++) {
//			if(Character.isUpperCase(str.charAt(i))) {
//				count++;
//			}
//			
//		}
//		System.out.println("uppercase ="+count);
		
	//9.count the numbers of lowercase letters
		

//		String str = "nisha";
//		int count = 0;
//		
//		for(int i=0;i<str.length();i++) {
//			if(Character.isLowerCase(str.charAt(i))) {
//				count++;
//			}
//			
//		}
//		System.out.println("lowercase ="+count);

		
	//10.count the numbers of digits in a string 
		
//		String str = "Nisha123";
//		int count =0;
//		
//		for(int i=0;i<str.length();i++) {
//			if(Character.isDigit(str.charAt(i))) {
//				count++;
//				
//			}
//		}
//		System.out.println("digits ="+count);
		
	//11.count the numbers of spaces in a string
		
//		String str = "Nisha s";
//		int  count = 0;
//		
//		for(int i=0;i<str.length();i++) {
//			if(str.charAt(i) == ' ') {
//				count++;
//			}
//		}
//		 System.out.println("spaces="+count);
		
      //12.count the occurence of a given character.
		
//		String str = "Nisha";
//		char ch = 'a';
//		int count = 0;
//		 
//		for(int i=0;i<str.length();i++) {
//			if(str.charAt(i)==ch) {
//				count++;
//				
//			}
//		}
//		 System.out.println("occurence="+count);

		//13.print the first character of a string.
		
//		    String str="NISHA";
//		    System.out.println(str.charAt(0));
		
		
		//14.print last character of a string
		
//		  String str = "Nisha";
//		  System.out.println(str.charAt(str.length()-1));
		
		//15.print characters at even index positions
		
//		  String str = "Nisha";
//		  for(int i=0;i<str.length();i+=2) {
//			  System.out.println(str.charAt(i)+"");
//		  }
		  
		
		//16.print characters at odd index positions
		
//		 String str = "Nisha";
//		 for(int i =1;i<str.length();i+=2) {
//	}
//			 System.out.println(str.charAt(i)+"");
		
		//17.convert string to uppercase using loop
		
//		String str="nisha";
//		for(int i=0;i<str.length();i++) {
//			System.out.println(Character.toUpperCase(str.charAt(i)));
//		
		 
		//18.convert string to lowercase using loop 
		
		
//     	String str="NISHA";
//		for(int i=0;i<str.length();i++) {
//			System.out.println(Character.toLowerCase(str.charAt(i)));
//		}
//		
		 //19.Replaces all spaces with-
		
//		  String str = "Nisha";
//		  for(int i=0;i<str.length();i++) {
//			  if(str.charAt(i)==' ')
//			   System.out.println(" - ");
//			  else
//				  System.out.println(str.charAt(i));
//		  }
		
		//20.remove all spaces 
		
		 String str = "Nisha";
		 for(int i =0;i<str.length();i++) {
			 if(str.charAt(i)!=' ')
				 System.out.println(str.charAt(i));
		 }
		 

	}	


}