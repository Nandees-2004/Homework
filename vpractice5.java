import jav.util.Scanner;

class practice5
{
	public static void main(Strin[] args)
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = s.nextInt();
		
		if (num >100)
		{
			if (num > 200)
			{
				System.out.println("Above 200");
				
			}
			else
			{
				System.out.println("Above 100");
			}
		}
	    else
		{
			System.out.println("Below 100")
			
		}
	
	}
	
}