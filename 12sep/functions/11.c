//WAP to find the largest number.

#include<stdio.h>
int largest(int , int);
int main(){
    int a,b;
largest(a,b);
}
int largest(int x, int y){
    printf("enter the two numbers to comoare :\n");
    scanf("%d%d",&x,&y);
    if(x>y){
        printf("%d is largest",x);
    }
    else{
        printf("%d is largest",y);
    }
}