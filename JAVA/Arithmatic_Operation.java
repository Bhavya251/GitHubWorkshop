package OOPJ;

import java.util.Scanner; //header for scanner class

public class Arithmatic_Operation {

	public static void main(String[] args) 
	{
		Scanner scan =new Scanner(System.in); // variable of Scanner class
		int choice,a,b;
		do
		{
            System.out.println("Choose the operation you want to perform ");
            System.out.println("Choose 1 for ADDITION");
            System.out.println("Choose 2 for SUBTRACTION");
            System.out.println("Choose 3 for MULTIPLICATION");
            System.out.println("Choose 4 for DIVISION");
            System.out.println("Choose 5 for EXIT");
            choice = scan.nextInt();
            
            switch(choice) //For entering choice
            {
				case 1: //Addition
					   int c;
					   System.out.println("Enter the two numbers to perform Addition ");
			           System.out.print("Enter the value of a: ");
			           a = scan.nextInt();
			           System.out.print("Enter the value of b: ");
			           b = scan.nextInt();
                       c= a + b;
                       System.out.println("Addition: \n"+c);
                       break;
				case 2: //Subtraction
					   int d;
					   System.out.println("Enter the two numbers to perform Subtraction ");
			           System.out.print("Enter the value of a: ");
			           a = scan.nextInt();
			           System.out.print("Enter the value of b: ");
			           b = scan.nextInt();
					   d= a - b;
 					   System.out.println("Subtraction:\n "+d);
 					   break;
				case 3: //Multiplication
					   int e;
					   System.out.println("Enter the two numbers to perform Multiplication ");
			           System.out.print("Enter the value of a: ");
			           a = scan.nextInt();
			           System.out.print("Enter the value of b: ");
			           b = scan.nextInt();
					   e= a * b;
					   System.out.println("Multiplication: \n"+e);
					   break;					   
				case 4: //Division
					   float f;
					   System.out.println("Enter the two numbers to perform Division ");
			           System.out.print("Enter the value of a: ");
			           a = scan.nextInt();
			           System.out.print("Enter the value of b: ");
			           b = scan.nextInt();
					   f= (float)a / b;
					   System.out.println("Division:  \n"+f);
					   break;				   
				case 5: //Exit
					  break;
			}
		}while(choice!=5);
	    scan.close();
	}
}
