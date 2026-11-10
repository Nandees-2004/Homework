import java.util.Scanner;
class array1
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
		for (int i = 0;i < arr.length;i++)
		{
			System.out.print(arr[i]+" ");
			
		}
		
	}
	
}