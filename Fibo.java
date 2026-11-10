import java.util.Scanner;

class Fibo
{
	
	void fibo(int n)
	{
		int a=0,b=1;
		
		for (int i=1;i<=n;i++)
		{
			System.out.print(a + " ");
			int c = a+b;
			a=b;
			b=c;
				
		}
		
	}
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the value to find Fibonacci sereis: ");
		int val = sc.nextInt();
		
		Fibo f = new Fibo();
		f.fibo(val);
		
		
	}
	
}