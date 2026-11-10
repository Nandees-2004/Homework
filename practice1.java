import java.util.Scanner;

class practice1
{
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		
		System.out.print("Enetr a number:");
		int num = s.nextInt();
		
		if(num >0)
		{
			if(num % 2 == 0)
			{
				System.out.println("Positive Even number");
			}
			else
			{
				System.out.println("Positive Odd number");
			}
			
		}
		else
		{
			if(num % 2 == 0)
			{
				System.out.println("Negative Even number");
			}
			else
			{
				System.out.println("Negative Odd number");
			}
		}
		
		
	}
	
}