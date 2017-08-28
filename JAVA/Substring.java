package OOPJ;
// Author: Bhavya Patel
// Date: 05-08-2017
// Print First and Last half of the String
import java.util.Scanner;
public class Substring 
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter String : ");
		String str=scan.nextLine();
		int len=str.length();
		String firstsub=str.substring(0, len/2); // First half of the string
		String lastsub=str.substring(len/2); // Last half of the string
		System.out.println("String : "+str+"\nFirst Substring : "+firstsub+"\nLast Substring : "+lastsub);
		scan.close();
	}
}