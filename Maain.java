import java.util.Scanner;
class Student
{
String name;
int id;
int marks;
void result()
{
if(marks>=35)
{
System.out.println("Pass");
}
else
{
System.out.println("Fail");
}
}
void grade()
{
if(marks>=50)
{
System.out.println("A");
}
else
{
System.out.println("B");
}
}
void display()
{
System.out.println(" name:"+name);
System.out.println("id:"+id);
System.out.println("marks:"+ marks);
}
}
public class Main
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
Student s=new Student();
System.out.println("Enter the name of the student:");
s.name=sc.nextLine();
System.out.println("enter the id of the student:");
s.id=sc.nextInt();
System.out.println("Enter the marks of the student:");
s.marks=sc.nextInt();
s.grade();
s.result();
s.display();
}
}

