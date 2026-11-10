import java.util.Scanner;
class array6
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Array size: ");
		int size = sc.nextInt();
	
		System.out.println("Enter the Numbers one by one: ");
		int arr[] = new int[size];
		
		for(int i = 0;i <= arr.length-1 ;i++)
		{
			arr[i]=sc.nextInt();
			
		}
		int count = 0;
		int sum = 0;
		
		for(int i = 0;i <= arr.length-1 ;i++)
		{
			if(arr[i]%2==0)
			{
				count++;
				sum += arr[i];
				
			}
		}
		System.out.println("Sum of the Even Numbers: "+sum);
		System.out.println("Count of the Even Numbers: "+count);
		
	}
	
}