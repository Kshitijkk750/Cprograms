//WAP to find the simple intrest.

#include<stdio.h>

float SI(float,float,float);
int main(){
    float a,b,c;
    float s;
    printf("Enter the profit :\t");
    scanf("%f",&a);
    printf("enter the no of years:\t");
    scanf("%f",&b);
    printf("enter the rate of intrest :\t");
    scanf("%f",&c);
    s=SI(a,b,c);
    printf("Simple intrest is :%.2f",s);
}
float SI(float p, float n, float r)
{
    float si;
    si=(p*n*r)/100;

    return si;
}