package OOPJ;
//Author	:	Bhavya Patel
//Date		:	19-08-2017
//Assignment:	2:2
//Print Two Double values and Sum of that numbers
import java.util.Scanner;
public class SumDouble 
{
	public static void main(String[] args) 
	{
		System.out.println("Enter 2 Double values");
		Scanner scan=new Scanner(System.in);
		System.out.print("Value 1 : ");
		double a=scan.nextDouble();
		System.out.print("Value 2 : ");
		double b=scan.nextDouble();
		double total = a+b; // Sum of Values
		System.out.println("\n\nDouble Value 1 : "+a+"\nValue 2 : "+b);
		System.out.println("Sum : "+total);
		scan.close();
	}

}
