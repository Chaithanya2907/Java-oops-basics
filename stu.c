#include<stdio.h>
int main()
{
char name[50];
int id;
int marks;
printf("Enter the name:");
scanf("%s",&name);
printf("Enter id:");
scanf("%d",&id);
printf("Enter marks:");
scanf("%d",&marks);
printf("~~~~~Student details~~~~~\n");
printf("Enter the name:%s\n",name);
printf("Enter id:%d\n",id);
printf("Enter marks:%d\n",marks);
if(marks>=35)
{
printf("pass\n");
}
else
{
printf("fail\n");
}
if(marks>=50)
{
printf("A\n");
}
else
{
printf("B\n");
}
return 0;
}