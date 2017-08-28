package OOPJ;
// Author	:	Bhavya Patel
// Date		:	19-08-2017
// Print Total Vowels in the string until user enter EXIT
import java.util.Scanner;
public class Quit 
{
	public static void main(String[] args) 
	{
		System.out.println("Enter Strings \nEnter EXIT to Exit");
		int vowels=0;
		Scanner scan=new Scanner(System.in);
		String str=scan.nextLine(); // Enter First string
		while(str.compareToIgnoreCase("exit")!=0) // Stop when user enter EXIT 
		{
			for(int i=0;i<str.length();i++) // For loop for counting Vowels
			{
				char ch=str.charAt(i);
				if(ch=='A'||ch=='a'||ch=='E'||ch=='e'||ch=='I'||ch=='i'||ch=='O'||ch=='o'||ch=='U'||ch=='u')
				{
					vowels++; 
				}
			}
			str=scan.nextLine(); // Entering strings into the loop
		}
		System.out.println("Total Vowels : "+vowels); // Print Total vowels
		scan.close();
	}
}