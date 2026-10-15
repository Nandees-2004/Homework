import java.util.Scanner;

class Q1
{
	public static void main(String[] args)
	{
		//Q1
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter number: ");
		int num = scan.nextInt();
		
		if( num % 2 == 0 )
		{
			System.out.println(num + " is Even Number");
		}
		else
		{
			System.out.println(num + " is Odd Number");
		}
		
		
	}
	
}