import java.util.Scanner;
class Q5
{
	
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the Mark: ");
		int num = scan.nextInt();
		
		if((num<100)&&(num>=90))
		{
			System.out.println("A");
		}
		else if((num<90)&&(num>=75))
		{
			System.out.println("B");
		}
		else if((num<75)&&(num>=50))
		{
			System.out.println("C");
		}
		else if((num>0)&&(num<50))
		{
			System.out.println("Fail");
		}
		else{
			System.out.println("Invalid Operations Enter proper Mark");
		}
		
	}
	
	
	
}