//WAP  to find even or odd number .

#include<stdio.h>

int check(int n)
{
    if(n%2==0){
        printf("number is even.\n");
    }else{
        printf("number is odd.\n");
    }
    return n;
}
int check(int);
int main(){
    int a;
    printf("enter the number :\n");
    scanf("%d",&a);
    a=check(a);
}