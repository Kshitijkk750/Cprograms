//WAP to calculate the area of rectangle

#include<stdio.h>
int area(int,int);
int main(){
    int n,m,r;
    printf("enter the length and breadth of rectangle :\n");
    scanf("%d%d",&n,&m);
    r=area(n,m);
    printf("Area of Rectangle is:%d\n",r);
}
int area(int x,int y){
    int a;
    a=x*y;
    return a;
}

