import java.util.Scanner;

class Switch_Statement_Scanners2
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter the number to find Odd or Even:");
		int a = scan.nextInt();
		
		if( a%2 == 0)
		{
			System.out.println(a + " is Even");
			
		}
		else{
			System.out.println(a + " is Odd");
			
		}
		
	}
	
	
}