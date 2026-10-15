import java.util.Scanner;

class Q3
{
	public static void main(String[] args)
	{
	
		//Q3
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter number3: ");
		
		int num3 = scan.nextInt();
		
		System.out.println("Enetr number4: ");
		
		int num4 = scan.nextInt();
		
		System.out.print("Enter the operation: ");
		
		String operation = scan.next();
		
		if(operation == "addition")
		{
			System.out.println(num3+num4);
		}
		else if(operation == "subtraction")
		{
			System.out.println(num3-num4);
		}
		else if(operation == "multiplication")
		{
			System.out.println(num3*num4);
		}
		else if(operation == "division")
		{
			System.out.println(num3/num4);
		}
		else{
			System.out.println("Type Valid Operations");
		}
			
	}
	
}