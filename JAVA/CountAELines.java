package OOPJ;
//Author	:	Bhavya Patel
//Date		:	19-08-2017
//Assignment:	2:6
//Print total lines starting with A & E and stop when QUIT is entered
import java.util.Scanner;
public class CountAELines 
{
	public static void main(String[] args) 
	{
		System.out.println("Enter Strings \nEnter EXIT to Exit");
		int ae=0;
		Scanner scan=new Scanner(System.in);
		String str=scan.nextLine(); // Enter First string
		while(str.compareToIgnoreCase("exit")!=0) // Stop when user enter EXIT 
		{
			char ch=str.charAt(0);
			if(ch=='A'||ch=='E')
			{
				ae++; 
			}
			str=scan.nextLine(); // Entering strings into the loop
		}
		System.out.println("Total : "+ae); // Print Total lines starting with A & E
		scan.close();
	}
}