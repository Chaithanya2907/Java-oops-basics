
import java.util.*;
class Student
{    
String name;    
int id;    
int marks;    
void display()  
{    
System.out.println("Name of the Student:" + name);    
System.out.println("id:" + id);    
System.out.println("Marks of the student:" + marks);  
}
}
public class Maain
{  
public static void main(String args[])  
{    
Scanner st= new Scanner(System.in);    
Student s=new Student();    
System.out.println("Enter the name of the student:");    
s.name=st.nextLine();    
System.out.println("Enter the id of student:");    
s.id=st.nextInt();    
System.out.println("Enter the marks of the student:");    
s.marks=st.nextInt();  
}
} 


 
