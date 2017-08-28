package OOPJ;
public class ForLoop 
{
	public static void main(String[] args) 
	{
		int a[]={1,2,3,4,5};
		for(int j=1;j<=5;j++)
		{
			System.out.print(" "+j);
		}
		System.out.println();
		for(int i:a)
		{
			System.out.print(" "+i);
		}
	}
}