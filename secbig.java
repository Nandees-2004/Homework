import java.util.Scanner;

class secbig
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Array Size: ");
		int size = sc.nextInt();
		
		int arr[] = new int[size];
		
		System.out.println("Enter the Number one by one");
		
		for(int i=0;i<=arr.length-1;i++)
		{
			arr[i] = sc.nextInt();
			
		}
		
		int max = arr[0];
		int secmax = 0;
		
		for(int i=0;i<=arr.length-1;i++)
		{
			if (arr[i] > max)
			{
				secmax = max;
				max = arr[i];
			}
			else if (arr[i] > secmax && arr[i] < max)
			{
					secmax = arr[i];
			}
			
		}
		System.out.println("Max: "+ max);
		System.out.println("SecMax: "+ secmax);
		
	}
	
}