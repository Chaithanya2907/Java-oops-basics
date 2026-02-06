class Student
{
String name;
int id;
int marks;
Student(String name,int id,int marks)
{
this.name=name;
this.id=id;
this.marks=marks;
}
void display()
{
System.out.println("Name of the student:" + name);
System.out.println("id:"+ id);
System.out.println("Student Marks:" + marks);
}
void checkresult()
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
if(marks>=90)
{
System.out.println("A");
}
else if(marks>=75)
{
System.out.println("B");
}
else if(marks>=50)
{
System.out.println("C");
}
else if(marks>=35)
{
System.out.println("D");
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
Student S=new Student("Chai",8,90);
S.display();
S.checkresult();
S.grade();
}
}

