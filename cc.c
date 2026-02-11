#include<stdio.h>
struct Student 
{
char name[50];
int id;
int marks;
};
int main()
{
struct Student s[3];
for(int i=0;i<3;i++)
{
printf("Enter the name of the student:\n");
scanf("%s",&s[i].name);
printf("enter id\n:");
scanf("%d",&s[i].id);
printf("enter marks:\n");
scanf("%d",&s[i].marks);
if(s[i].marks>=35)
{
printf("Pass\n");
}
else
{
printf("fail\n");
}
if(s[i].marks>=50)
{
printf("A\n");
}
else
{
printf("B\n");
}
printf("~~~~Student details~~~~\n");
printf("Name:%s\n",s[i].name);
printf("id:%d\n",s[i].id);
printf("Marks:%d\n",s[i].marks);
}
return 0;
}


