import java.util.Scanner;

class practice4
{
	public static void main(Strin[] args)
	{
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter Mark: ")
		int mark = s.nextInt();
		
		if (mark >= 35)
		{
			if (mark >= 90)
			{
				System.out.println("Excellent")
			}
			else
			{
				System.out.println("Pass")
			}
		}
		else
		{
			System.out.println("Fail")
		}
		
		
	}
	
}