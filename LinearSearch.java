import java.util.Scanner;
class LinearSearch
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter array size: ");
		int size = sc.nextInt();
		
		int ar[] = new int[size];
		System.out.println("Enter the Array Datas:");
		
		for(int i = 0;i<ar.length;i++)
		{
			ar[i] = sc.nextInt();
		}
		System.out.print("Enter the Target Data:");
		int tar = sc.nextInt();
		
		LinearSearch ls = new LinearSearch();
		int res = ls.linearSearch(ar,tar);
		
		if (res == -1)
		{
			System.out.println("Invalid Target");
			
		}
		else
		{
			System.out.println("Index "+res);
		}
		
	}
	
	int linearSearch(int br[],int target)
	{
		for(int i = 0; i<br.length;i++)
		{
			if(br[i]==target)
			{
				return i;
			}
			
		}
		return -1;
		
	}
	
}