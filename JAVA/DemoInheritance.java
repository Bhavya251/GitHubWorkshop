package OOPJ;
import java.util.Scanner;
class A
{
	int a,b;
	A(int x,int y)
	{
		a=x;
		b=y;
	}	
}
class B extends A
{
	int c;
	B(int x,int y,int z)
	{
		super(x,y);
		c=z;
	}
	void display()
	{
		System.out.println("A: B: C: "+a+" "+b+" "+c);
	}
}
public class DemoInheritance 
{
	public static void main(String[] args) 
	{
		int x,y,z;
		System.out.println("Enter 3 values");
		Scanner sc=new Scanner(System.in);
		x=sc.nextInt();
		y=sc.nextInt();
		z=sc.nextInt();
		B B1=new B(x,y,z);
		B1.display();
		sc.close();
	}
}