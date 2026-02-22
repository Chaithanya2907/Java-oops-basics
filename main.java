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
if(marks>=75)
{
System.out.println("A");
}
else if(marks>=50)
{
System.out.println("B");
}
else if(marks>=35)
{
System.out.println("C");
}
else
{
System.out.println("Fail");
}
}
}
public class Main
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
Student s[]=new Student[2];
int total=0;
double average;
int max=0;
String topper="";
for(int i=0;i<2;i++)
{
s[i]=new Student();
System.out.println("Enter student name:");
s[i].name=sc.nextLine();
System.out.println("Enter id:");
s[i].id=sc.nextInt();
System.out.println("Enter marks:");
s[i].marks=sc.nextInt();
sc.nextLine();
total=total+s[i].marks;
if(s[i].marks>max)
{
max=s[i].marks;
topper=s[i].name;
}
s[i].grade();
s[i].result();
}
average=total/2;
System.out.println("~~~~~Topper details~~~~~");
System.out.println("total:"+ total);
System.out.println("average:"+ average);
System.out.println("topper:"+topper);
System.out.println("~~~~~~~~~~");
}
}
