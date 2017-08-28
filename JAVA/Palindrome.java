package OOPJ;
//Author	:	Bhavya Patel
//Date		:	19-08-2017
//Print String or Number is Palindrome or not
import java.util.Scanner;
public class Palindrome 
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		String str, rev=""; 
		System.out.println("Enter String or number :");
		str=scan.nextLine(); // Enter String or Number
		int len=str.length();
		for(int i=len-1;i>=0;i--) // Reversing the String or Number
		{
			rev=rev+str.charAt(i);
		}
		if(str.equals(rev)) // If String = Reverse String then it is Palindrome
			System.out.println("It is Palindrome.");
		else 
			System.out.println("It is not palindrome.");
		scan.close();
	}
}