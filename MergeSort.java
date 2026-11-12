import java.util.Arrays;
import java.util.Scanner;
class MergeSort
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Array Size: ");
		int size = sc.nextInt();
		
		int arr[] = new int[size];
		for(int i = 0;i<size;i++)
		{
			arr[i]=sc.nextInt();
		}
		for(int i = 0;i<size;i++)
		{
			System.out.print(arr[i]+" ");
		}
		
		MergeSort ms = new MergeSort();
		int res[] = ms.divide(arr);
		
		System.out.println();
		System.out.print("Merge Sorted Array :");
		
		for(int i = 0;i<res.length;i++)
		{
			System.out.print(res[i]+" ");
			
		}
		System.out.println();
		for(int i = 0;i<res.length;i++)
		{
			if(i == (res.length/2))
			{
				System.out.println("Middle Element of the Array is : "+res[i]);
			}
		}
	}
	
	int[] divide(int brr[])
	{
		if(brr.length == 1)
		{
			return brr;
		}
		
		int mid = (brr.length/2);
		
		int left[] = divide(Arrays.copyOfRange(brr,0,mid));
		int right[] = divide(Arrays.copyOfRange(brr,mid,brr.length));
		
		return conquer(left,right);
	}
	
	int[] conquer(int[] left1,int[] right1)
	{
		int i=0;
		int j=0;
		int k=0;
		int newarr[] = new int[left1.length+right1.length];
		
		while(i<left1.length && j<right1.length)
		{
			if(left1[i]<right1[j])
			{
				newarr[k] = left1[i];
				i++;
				k++;
					
			}
			else
			{
				newarr[k] = right1[j];
				j++;
				k++;
			}
		}
		while(i < left1.length)
		{
			newarr[k] = left1[i];
			i++;
			k++;
		}
		while(j < right1.length)
		{
			newarr[k] = right1[j];
			j++;
			k++;
		}
		return newarr;
		
	}
	
}