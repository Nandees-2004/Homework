import java.util.Scanner;

class practice5
{
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		System.out.print("Enter Units: ");
		int unit = s.nextInt();
		
		if (unit >100)
		{
			if (unit > 200)
			{
				System.out.println("High Usage");
				
			}
			else
			{
				System.out.println("Medium Usage");
			}
		}
	    else
		{
			System.out.println("Low Usage");
			
		}
	
	}
	
}