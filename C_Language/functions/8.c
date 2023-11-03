//WAP to swap the number using function.

#include<stdio.h>
int swap(int ,int);
int main(){
    int a,b,c;
    printf("enter the two numbers :\n");
    scanf("%d%d",&a,&b);
    c=swap(a,b);

    //printf("after swapping the numbers are :%d\t%d",);
}
int swap( int x,int y){
    int z;
    z=x;
    x=y;
    y=z;
        printf("after swapping the numbers are :%d\t%d\n",x,y);

    return (x,y);
    
}

