//with with parameter without argument/return type

#include<stdio.h>
void Add(int,int);
int main(){
	int a,b;
    printf("enter the number :");
	scanf("%d%d",&a,&b);
    Add(a,b);
}
void Add(int x,int y)
{
    printf("Addition is :%d\n",x+y);
}
