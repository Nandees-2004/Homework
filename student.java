import java.util.Scanner;
class Student
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("1.Add student details");
		System.out.println("2.Update student name");
		System.out.println("3.Display student details");
		System.out.println("4.Exit");
		System.out.print("Enter the option:");
		int opt = sc.nextInt();
		sc.nextLine();
		System.out.println();
		form f = new form();
		while(opt<5)
		{
			switch(opt)
			{
				case 1:
					System.out.print("Enter student name:");
					String name = sc.nextLine();
					System.out.println();
					
					System.out.print("Enter student rollno:");
					int rollno = sc.nextInt();
					System.out.println();
					
					System.out.print("Enter student age:");
					int age = sc.nextInt();
					sc.nextLine();
					System.out.println();
					
					System.out.print("Enter student city:");
					String city = sc.nextLine();
					System.out.println();
					
					f.detail(name,rollno,age,city);
					System.out.print("Enter the option:");
		            opt = sc.nextInt();
					break;
					
				case 2:
					System.out.print("Enter student name to update:");
					String newname = sc.nextLine();
					
					f.nameupdate(newname);
					System.out.print("Enter the option:");
		            opt = sc.nextInt();
					break;
					
				case 3:
					f.disp();
					System.out.print("Enter the option:");
		            opt = sc.nextInt();
					break;
					
				case 4:
					System.out.print("Exited");
					opt = opt+1;
					break;
			}
		}
	}
	
}