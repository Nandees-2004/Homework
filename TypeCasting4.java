import java.util.Scanner;

class TypeCasting4
{
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Sample Input: ");
		int num = sc.nextInt();
		
		byte num1 = (byte)num;
		
		System.out.println("Sample Output: "+num1);
		
	}
	
}