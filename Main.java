class Student
{
	String name;
   	int marks;
	int id;
	public Student(String name, int marks, int id)
   	{
		this.name=name;
     		this.id=id;
		this.marks=marks;
	}
	void display()
	{
		System.out.println("Name of the student:" + name);
     		System.out.println("id:" + id);
		System.out.println("Marks:" + marks);
   	}
}
public class Main
{
	public static void main(String args[])
   	{
		Student s=new Student("chai",8,98);
     		s.display();
	}
}	
	
	
 