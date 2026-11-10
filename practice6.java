import java.util.Scanner;

class practice6
{
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		System.out.print("Enter username: ")
		String username = s.nextLine();
		System.out.print("Enter username: ")
		String password = s.nextLine();
		
		if (username == "admin")
		{
			if (password == "123")
			{
				System.out.println("Login Successful");
			}
			else 
			{
				Syste.out.println("Wrong password");
			}
		}
		else
		{
			System.out.println("Wrong username")
		}
	}
}

