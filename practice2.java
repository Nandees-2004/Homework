import java.util.Scanner;

class practice2
{
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		
		System.out.print("Enter your age: ");
		int age = s.nextInt();
		System.out.print("Are you a citizen(true/false): ");
		boolean citizen = s.nextBoolean();
		
		if (age>=18)
		{
			if (citizen == true)
			{
				System.out.println("Eligible to Vote");
			}				
			else 
			{
				System.out.println("Citizen can only Vote");
			}
		}
		else
		{
			System.out.println("Age is not Eligible to Vote");
		}
		
		
	}
	
	
}