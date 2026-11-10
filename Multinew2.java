import java.util.Scanner;
class Multinew2
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int ar[][] = new int[2][3];
		
		System.out.println("Enter Matrix Components:");
		for (int i = 0;i < ar.length;i++)
		{
			for(int j = 0;j<ar[i].length;j++)
			{
				ar[i][j]=sc.nextInt();
			}
		}
		
		int max = ar[0][1];
		for (int i = 0;i < ar.length;i++)
		{
			for(int j = 0;j<ar[i].length;j++)
			{
				if(ar[i][j] > max)
				{
					max = ar[i][j];
				}
			}
		} 
		System.out.println("The Maximum number in the matrix is : "+max);
	}
	
	
}