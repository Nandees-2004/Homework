import java.util.Scanner;

class BankLoanEligibilitySystem
{
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		
		System.out.println("====Bank Loan Eligibility System ====");
		
		System.out.print("Enter Name: ");
		String name = s.nextLine();
		
		System.out.print("Enter Age: ");
		int age = s.nextInt();
		
		System.out.print("Enter Monthly Salary: ");
		int salary = s.nextInt();
		
		System.out.print("Enter CIBIL Score: ");
		int cibil = s.nextInt();
		
		System.out.print("Are you an Exixting Customer?(true/false): ");
		boolean cust = s.nextBoolean();
		
		if(age >= 21)
		{
			if(salary >= 20000)
			{
				if(cibil >= 750)
				{
					if(cust == true)
					{
						System.out.println("Eligible for Premium Loan");
					}
					
					else
					{
						System.out.println("Eligible for Standard Loan");
					}
				}
				else if((cibil >=650) && (cibil <750))
				{
					
					System.out.println("Elligible for Low Amount Loan");
					
				}
				else if(cibil < 650)
				{
					System.out.println("Not Eligible (Low CIBIL Score)");
					
				}
			}
			else if(salary < 20000)
			{
				System.out.println("Not Eligible (Low Salary)");
				
			}
		}
		else if (age < 21)
		{
			System.out.println("Not Eligible (Age criteria not satisfied)");
			
		}
		
		
	}
	
	
}