import java.util.Scanner;

class Q4
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		int age = scan.nextInt();
		
		if(age>=18)
		{
			System.out.print("Eligible to vote ");
		}
		else
		{
			System.out.println("Not Eligible to vote ");
		}
	}	
	
}