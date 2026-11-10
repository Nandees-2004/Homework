import java.util.Scanner;
class BinarySearch
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
		
		BinarySearch bs = new BinarySearch();
		int res = bs.binarySearch(ar,tar);
		
		if (res == -1)
		{
			System.out.println("Invalid Target");
			
		}
		else
		{
			System.out.println("Index "+res);
		}
		
	}
	
	int binarySearch(int br[],int target)
	{
		int start = 0;
		int end = br.length-1;
		int middle = 0;
		
		while(start <= end)
		{
			middle = (start+end)/2;
			
			if(br[middle] == target)
			{
				return middle;
				
			}
			else if(br[middle] < target)
			{
				start = middle + 1;
			}
			else
			{
				end = middle-1;
				
			}
		}
		return -1;
		
	}
	
}