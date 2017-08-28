package OOPJ;
//Author	:	Bhavya Patel
//Date		:	19-08-2017
//Print WORD PYRAMID
import java.util.Scanner;
public class WordPyramid 
{
	public static void main(String[] args) 
	{
		int i,j,k;
		char ch;
		System.out.println("Word Pattern :  \n");
		Scanner scan=new Scanner(System.in);
		String str=scan.nextLine();
		int len=str.length();
		for(i=0;i<len-1;i++) // For Upper Triangle of the pattern
		{
			for(j=0;j<len-i-1;j++) // Space before Character
			{
				System.out.print(" ");
			}
			for(k=0;k<=i;k++) // Printing Character
			{
				ch=str.charAt(k);
				System.out.print(""+ch+" ");
			}
			System.out.println();
		}
		for(i=len;i>=0;i--) // For Lower Triangle of the pattern
		{
			for(j=0;j<len-i;j++) // Space before Character
			{
				System.out.print(" ");
			}
			for(k=0;k<i;k++) // Printing Character
			{
				ch=str.charAt(k);
				System.out.print(""+ch+" ");
			}
			System.out.println();
		}
		scan.close();
	}
}