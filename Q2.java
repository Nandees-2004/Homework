import java.util.Scanner;

class Q2
{
	public static void main(String[] args)
	{
		//Q2
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter number1: ");
		int num1 = scan.nextInt();
		
		System.out.print("Enetr number2: ");
		int num2 = scan.nextInt();
		
		if(num1>num2)
		{
			System.out.println(num1 + " is Greater");
		}
		else if(num2>num1)
		{
			System.out.println(num2 + " is Greater");
		}
		else
		{
		System.out.println("Both are Equal");
		}
		
	}
	
}