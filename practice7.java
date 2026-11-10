import java.util.Scanner;

class practice7
{
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter age: ");
		int age = s.nextInt();
		System.out.println("Do you have a learner's license (true/false):");
		boolean learner = s.nextBoolean();
		
		if (age >= 18)
		{
			if (learner == true)
			{
				System.out.println("Can Apply for Driving Test");
			}
			else
			{
				System.out.println("Can Apply for Driving Test without learner's license")
			}
		}
		else
		{
			System.out.println("Can't Apply for Driving Test");
		}
		
	}
}