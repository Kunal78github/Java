class Student1
{
	int roll;
	String name;
	static String cname="XYZ";
	
	Student1(int x, String y)
	{
		roll = x;
		name=y;
	}
	void display()
	{
		System.out.println("Roll= "+roll+"Name= "+name+"CollegeName="+cname);
	}
	static void change()
	{
		cname="ABC";
	}
	class Det
	{
		public static void main(String[]args)
		{
			Student s= new Student(101, "Ram");
			Student s1 = new Student(102, "Shaym");
			s.display();
			s1.display();
			Student1.change();
			s.display();
			s1.display();
		}
	}
	
}