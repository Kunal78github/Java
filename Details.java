class Student
{
	int roll;
	String name;
	Static String cname="XYZ";
	
	Student(int x,String y)
	{
	roll = x;
	name = y;
	}
	void display()
	{
		System.out.println("Roll="+roll+"Name="+name+"CollegeName="+cname);
	}
}
class Details
{
	public static void main(String[]args)
	{
		Student s = new Student(101,"Ram");
		Student s1 = new Student(102,"Shaym");
		s.diaplay();
		s1.display();
		
	}
}