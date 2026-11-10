import java.util.Scanner;

class Multinew1
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int ar1[][] = new int[2][2];
		int ar2[][] = new int[2][2];
		
		System.out.println("Enter Matrix 1 Components:");
		for (int i = 0;i < ar1.length;i++)
		{
			for(int j = 0;j<ar1[i].length;j++)
			{
				ar1[i][j]=sc.nextInt();
			}
		}
		System.out.println("Enter Matrix 2 Components:");
		for (int i = 0;i < ar2.length;i++)
		{
			for(int j = 0;j<ar2[i].length;j++)
			{
				ar2[i][j]=sc.nextInt();
			}
		}
		
		System.out.println("Matrix 1: ");
		for (int i = 0;i < ar1.length;i++)
		{
			for(int j = 0;j<ar1[i].length;j++)
			{
				System.out.print(ar1[i][j]+" ");
			}
			System.out.println();
		}
		
		System.out.println("Matrix 2: ");
		for (int i = 0;i < ar2.length;i++)
		{
			for(int j = 0;j<ar2[i].length;j++)
			{
				System.out.print(ar2[i][j]+" ");
			}
			System.out.println();
		}
		
		System.out.println("Sum of the 2 Matrixex:");
		
		for (int i = 0;i < ar2.length;i++)
		{
			for(int j = 0;j<ar2[i].length;j++)
			{
				System.out.print(ar1[i][j]+ar2[i][j]+" ");
			}
			System.out.println();
		}
		
		
		//System.out.print("Sum of two Matrix :" + (ar1[][] + ar2[][]));
	}
	
}