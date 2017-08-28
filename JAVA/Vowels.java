package OOPJ;
// Author: Bhavya Patel
// Date: 05-08-2017
// Print Total Vowels, Digit & Constants of the String
import java.util.Scanner;
public class Vowels 
{
	public static void main(String[] args) 
	{
		int vowels=0,constants=0,digit=0;
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter String : ");
		String str=scan.nextLine();
		char ch;
		int len=str.length(); // Length of the STRING
		for(int i=0;i<len;i++)
		{
			ch=str.charAt(i);
			if(ch=='A'||ch=='a'||ch=='E'||ch=='e'||ch=='I'||ch=='i'||ch=='O'||ch=='o'||ch=='U'||ch=='u')
			{
				vowels++; // Counting VOWELS
			}
			else if(ch==' ')
			{
				continue; // Skip if SPACE is encountered
			}
			else if(Character.isDigit(ch))
			{
				digit++; // Counting DIGITS
			}
			else
			{
				constants++; // Counting CONSTANTS
			}
		}
		System.out.println("String : "+str+"\nVowels : "+vowels+"\nConstants : "+constants+"\nDigits : "+digit);
		scan.close();
	}
}