package OOPJ;
// Author: Bhavya Patel
// Date: 05-08-2017
// Print Total Capital Letters of the String
import java.util.Scanner;
public class CapitalLetters 
{
	public static void main(String[] args) 
	{
		System.out.println("Enter String : ");
		Scanner scan=new Scanner(System.in);
		String str=scan.nextLine(); // Object of String class
		int capital=0;
		int len=str.length(); // Length of the String
		char ch;
		for(int i=0;i<len;i++)
		{
			ch=str.charAt(i); // Character at specific position of the String
			if(ch>=65 && ch<=90) // Counting capital Letters
			{
				capital++;
			}
			while((i < str.length()) && (str.charAt(i) != ' '))
			{
				i++;
			}
		}
		System.out.println("String : "+str+"\nTotal Capital Words : "+capital);
		scan.close();
	}
}