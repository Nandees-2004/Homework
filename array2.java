import java.util.Scanner;
class array2
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
		
		int total =0;
		
		for (int i = 0;i < arr.length;i++)
		{
			total += arr[i];
			
		}
			System.out.print("Total:" + total);
			
		
		
	}
	
}