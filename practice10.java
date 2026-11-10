import java.util.Scanner;

class practice10
{
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		
		System.out.print("Enter balance: ");
		int bal = s.nextInt();
		
		System.out.print("Enter withdrawal amount: ");
		int with = s.nextInt();
		
		if (bal > 0)
		{
			if (with <= bal)
			{
				System.out.println("Withdrawal Successful Remaining balance:" + (bal-with));
			}
			else
			{
				System.out.println("Available balance:" + bal);
			}
		}
		else
		{
			System.out.println("Check your balance:" + bal);
			
		}

	}
}