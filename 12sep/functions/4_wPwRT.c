//WAP with return type with parameter.

#include<stdio.h>

int Add(int,int);
int main(){
    int a,b,c;
    printf("enter the numbers :\n");
    scanf("%d%d",&a,&b);
    c=Add(a,b);
    printf("Addition is :%d\n",c);

}
int Add(int x,int y)
{
    int sum;
    sum=x+y;

    return sum;
}