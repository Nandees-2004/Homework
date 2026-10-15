import java.util.Scanner;

class Switch_Statement_Scanners1
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter either Postive or Negative Number:");
		int a = scan.nextInt();
		
		if(a>=0)
		{
			System.out.println("Number is positive");
			
		}
		
      	else
		{
			System.out.println("Number is Negative");
		}
		
	}
	
	
}