//WAP to interchange the values of two variables without using third variable.

#include<stdio.h>
int main(){
	int a,b;
	printf("enter the two variables :");
	scanf("\n%d\t%d",&a,&b);
	a=a+b;
	b=a-b;
	a=a-b;
	printf("%d\t%d\n",a,b);
}
