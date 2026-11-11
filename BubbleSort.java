import java.util.Scanner;
class BubbleSort
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Size of the Array: ");
		int size = sc.nextInt();
		System.out.print("Enter the Array Elements to Sort:  ");
		int arr[] = new int[size];
		
		for(int i = 0;i<size;i++)
		{
			arr[i]=sc.nextInt();
		}
		for(int i = 0;i<size;i++)
		{
			System.out.print(arr[i]+" ");
		}
		
		BubbleSort bs = new BubbleSort();
		int[] res = bs.bubbleSort(arr);
		
		System.out.println();
		
		System.out.print("Sorted Array: ");
		for(int i=0;i<res.length;i++)
		{
		System.out.print(res[i]+" ");
		}
	}
	
	int[] bubbleSort(int brr[])
	{
		for(int i=0;i<brr.length-1;i++)
		{
			for(int j=0;j<brr.length-1;j++)
			{
				if(brr[j]>brr[j+1])
				{
					int temp = brr[j];
					brr[j] = brr[j+1];
					brr[j+1] = temp;
				
				}
			}
					
		}
		
		return brr;
	}
	
}