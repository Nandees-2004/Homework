import java.util.Scanner;
class array3
{
	public static void main(String[] ar)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Array size: ");
		int size = sc.nextInt();
		
		System.out.println("Enter the Number one by one: ");
		
		int arr[] = new int[size];
		
		for (int i = 0;i < arr.length;i++)
		{
			arr[i] = sc.nextInt();
			
		}
		
		int max = arr[0];
		
		for (int i = 0;i < arr.length;i++)
		{
			if(arr[i]>max)
			{
				max =arr[i];
			}
			
		}
		System.out.println("Biggest number is "+max);
		
	}
	
}