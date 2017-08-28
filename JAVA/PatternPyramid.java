package OOPJ;
//Author	:	Bhavya Patel
//Date		:	19-08-2017
//Print PATTERN PYRAMID
import java.util.Scanner;
public class PatternPyramid 
{
	public static void main(String[] args) 
	{
		int i,j,k,n;
		System.out.print("Enter number of rows of Pattern : ");
		Scanner scan=new Scanner(System.in);
		n=scan.nextInt();
		for(i=0;i<n-1;i++) // For Upper Triangle of the pattern
		{
			for(j=0;j<n-i-1;j++) // Space before *
			{
				System.out.print(" ");
			}
			for(k=0;k<=i;k++) // Printing *
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		for(i=n;i>=0;i--) // For Lower Triangle of the pattern
		{
			for(j=0;j<n-i;j++) // Space before *
			{
				System.out.print(" ");
			}
			for(k=0;k<i;k++) // Printing *
			{
				System.out.print("* ");
			}
			System.out.println();
		}	
		scan.close();
	}
}