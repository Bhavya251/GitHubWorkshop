package OOPJ;
//Author	:	Bhavya Patel
//Date		:	19-08-2017
//Assignment:	2:1
//Print Four element Array and calculate average of its values
import java.util.Scanner;
public class Array4 
{
	public static void main(String[] args) 
	{
		int i;
		int[] array = new int[4];
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter 4 elements");
		for(i=0;i<4;i++)
		{
			System.out.print("Element "+i+" : ");
			array[i]=scan.nextInt();
		}
		int total=0;
		for(i=0;i<4;i++)
		{
			total=total+array[i];
		}
		float average=total/4;
		System.out.println("Total : "+total+"\nAverage : "+average);
		scan.close();
	}
}