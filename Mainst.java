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
System.out.println("Enter student:"+name);
System.out.println("Enter id:"+id);
System.out.println("Enter marks:"+marks);
}
}
public class Main
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
Student s[]=new Student[3];
for(int i=0;i<3;i++)
{
s[i]=new Student();
System.out.println("Enter student:");
s[i].name=sc.nextLine();
System.out.println("Enter the id:");
s[i].id=sc.nextInt();
System.out.println("Enter Marks:");
s[i].marks=sc.nextInt();
sc.nextLine();
}
for(int i=0;i<3;i++)
{
s[i].display();
s[i].result();
s[i].grade();
}
}
}
