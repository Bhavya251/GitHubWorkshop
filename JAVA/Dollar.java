package OOPJ;
import java.util.Scanner; //header for scanner class
public class Dollar 
{

	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in); // variable of Scanner class
		int rup,rate;
		System.out.println("Enter rate of rupees to dollar");
		rate=scan.nextInt();
		System.out.println("Enter Rupees : ");
		rup= scan.nextInt();
		float dol=(float) rup/rate; // Rupees to Dollar conversion
		System.out.println(rup+" Rupees : "+dol+" Dollar ");
		scan.close();
	}
}