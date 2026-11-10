import java.util.Scanner;
class loop2
{
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		
		System.out.print("Enter a Number to find its Number of Digits: ");
		int num = s.nextInt();
		
		int temp = Math.abs(num);
		int count = 0;
		
		
		do
		{
			count++;
			temp /= 10;
			
			
		}while(temp > 0);
		
		System.out.println(num + " has "+ count+" digits" );
		
	}
	
}