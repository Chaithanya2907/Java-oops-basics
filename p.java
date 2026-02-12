import java.util.Scanner;
class Patient
{
int patientid;
String patientname;
int age;
void display()
{
System.out.println("Enter name:"+patientname);
System.out.println("enter id:"+patientid);
System.out.println("Enter age:"+age);
}
}
public class Main
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
Patient p[]=new Patient[3];
for(int i=0;i<3;i++)
{
p[i]=new Patient();
System.out.println("Name:");
p[i].patientname = sc.nextLine();
System.out.println("ID:");
p[i].patientid=sc.nextInt();
System.out.println("Age:");
p[i].age=sc.nextInt();
sc.nextLine();
}
for(int i=0;i<3;i++)
{
p[i].display();
}
}
}
