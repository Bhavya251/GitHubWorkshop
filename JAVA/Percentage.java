package OOPJ;
import java.util.Scanner; //Object of Scanner class
public class Percentage 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in); //variable of Scanner class
		int total=0;
		System.out.println("Enter marks for 6 subjects");
		int[] sub= new int[6]; //Array
		for(int i=0;i<6;i++) //Initializing Array 
		{
			System.out.println("Subject : "+(i+1));
			sub[i]= scan.nextInt();
		}
		for(int i=0;i<6;i++) //Total of marks
		{
			total=sub[i]+total;
		}
		System.out.println("Total Marks = "+ total);
		float percentage = (float) total/6; //Percentage
		System.out.println("Percentage = "+percentage);
		scan.close();
	}
}