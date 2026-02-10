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
if(marks>=35)
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
System.out.println("Enter the student name:"+ name);
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
System.out.println("Name:");
s[i].name=sc.nextLine();
System.out.println("id:");
s[i].id=sc.nextInt();
System.out.println("Marks:");
s[i].marks=sc.nextInt();
sc.nextLine();
}
for(int i=0;i<3;i++)
{
s[i].result();
s[i].grade();
s[i].display();
}
int total=0;
for(int i=0;i<3;i++)
{
total+=s[i].marks;
}
double average = total/3.0;
System.out.println("Enter total marks:"+ total);
System.out.println("enter average:"+average);
}
}



