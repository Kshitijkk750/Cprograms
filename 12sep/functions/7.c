//WAP to print square of the number.

#include<stdio.h>

int square(int);
int main(){
    int n,s;
    printf("enter the number :\n");
    scanf("%d",&n);
    s=square(n);
    printf("square of the number is:%d\n",s);
}
int square(int a)
{
    int b;
    b=a*a;
    return b;
}