import java.util.Scanner;
class DSA1
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int ad[] = new int[100];
		int count = 0;
		int choice;
		
		do
		{
			System.out.println("Menu:");
			System.out.println("1. Add employee ID");
		    System.out.println("2. Remove employee ID");
	 	    System.out.println("3. Display employee IDs");
		    System.out.println("4. Exit");
			
			System.out.print("Enter your choice:");
		    choice = sc.nextInt();
			
			if(choice == 1)
			{
				System.out.print("Enter employee ID: ");
				int id = sc.nextInt();
				
				ad[count]=id;
				count++;
				System.out.println("Employee ID added.");
				
			}
			else if(choice == 2)
			{
				System.out.println("Enter employee ID to remove:");
			    int idrem = sc.nextInt();
				
				int pos= -1;
				
				for(int i=0;i<count;i++)
				{
					if(ad[i] == idrem)
					{
						pos = i;
					}
				}
				
				for(int i=pos;i<count-1;i++)
				{
					ad[i]=ad[i+1];
				}
				count--;
				System.out.println("Employee ID Removed.");
				
				
		    }
			else if(choice == 3)
			{
				System.out.println("Employee IDs:");
				
				for(int i =0;i<count;i++)
                {
				  System.out.println(ad[i]);	
			    } 
			}
			
			else if(choice == 4)
			{
				System.out.println("Exiting.");
			}
		
		}while(choice != 4);
		
	}
}