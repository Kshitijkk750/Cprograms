//WAP to find smallest number..

#include<stdio.h>

int main(){
    int a,b;
    printf("enter the two numbers :\n");
    scanf("%d%d",&a,&b);
    smallest(a,b);
}
int smallest(int x,int y){
    if(x>y){
        printf("%d is smallest.",y);
    }
    else{
        printf("%d is smallest",x);
    }
}