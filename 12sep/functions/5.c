//WAP to find factorial using function.

#include<stdio.h>

int fact(int);
int main(){
    int a,n,c;
    printf("enter the number :\n");
    scanf("%d",&a);
    c=fact(a);
    printf("factorial is :%d\n",c);

}
int fact(int x)
{
    int fact=1;
    for(int i=1;i<=x;i++){
        fact=fact*i;
    }
    

    return fact;
}
