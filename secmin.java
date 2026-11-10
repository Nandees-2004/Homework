import java.util.Scanner;

class secmin
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
		
		int min = arr[0];
		int secmin = 0;
		
		for(int i=0;i<=arr.length-1;i++)
		{
			if (arr[i] < min)
			{
				secmin = min;
				min = arr[i];
			}
			else if (arr[i] < secmin && arr[i] > min)
			{
					secmin = arr[i];
			}
			
		}
		System.out.println("Min: "+ min);
		System.out.println("SecMin: "+ secmin);
		
	}
	
}