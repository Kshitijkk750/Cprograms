//WAP to interchange the values of two variables by using third variable..

#include<stdio.h>
int main(){
	int a,b,c;
	printf("enter the numbers :");
	scanf("%d%d",&a,&b);
	c=a;
	a=b;
	b=c;
	printf("\t%d\t%d\n",a,b);
	
	
}
