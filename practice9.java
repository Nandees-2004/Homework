import java.util.Scanner;

class practice3
{
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		
		System.out.print("Enter first number:");
		int num1 = s.nextInt();
		System.out.print("Enter second number:");
		int num2 = s.nextInt();
		System.out.print("Enter third number:");
		int num3 = s.nextInt();
		
		if ((num1>num2)&& (num1>num3))
		{
			if (num1 % 2 == 0)
			{
				System.out.println(num1 + " is greater and Even Number");
				
			}
			else
			{
				System.out.println(num1 + " is greater and Odd Number");
			}
		}
		else if ((num2>num1)&& (num2>num3))
		{
			if (num2 % 2 == 0)
			{
				System.out.println(num2 + " is greater and Even Number");
				
			}
			else
			{
				System.out.println(num2 + " is greater and Odd Number");
			}
			
		}
		else
		{
			if (num3 % 2 == 0)
			{
				System.out.println(num3 + " is greater and Even Number");
				
			}
			else
			{
				System.out.println(num3 + " is greater and Odd Number");
			}
			
		}
			
		
		
	}
	
}