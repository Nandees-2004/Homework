import java.util.Scanner;

class Prime
{
	void findprime(int n)
	{
		int count = 0;
		
		for (int i =1;i <=n;i++)
		{
			if (n%i==0)
			{
				count++;
			}
			
		}
		if (count == 2)
		{
			System.out.print(n + " is prime Number");
		}
		else
		{
			System.out.print(n + " is Not a Prime Number");
		}
		
	}
	
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a number to find wheather it is a Prime or not: ");
		int val = sc.nextInt();
		
		Prime p = new Prime();
		p.findprime(val);
		
		
	}
	
}