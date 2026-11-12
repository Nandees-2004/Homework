class form
{
	String name ;
	int rollno;
	int age;
	String city;
	
	void detail(String n,int r,int a,String c)
	{
		name = n;
		rollno = r;
		age = a;
		city = c;
	}
	
	void nameupdate(String newname)
	{
		name = newname;
		System.out.println("Student Name is updtaed");
	}
	
	void disp()
	{
		System.out.println("Name of the student : "+name);
		System.out.println("Rollno of the student : "+rollno);
		System.out.println("Age of the student : "+age);
		System.out.println("City of the student : "+city);
		
		
	}
	
}