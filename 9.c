//WAP to add,sub,mul,div,mod of two variables and print the result.

#include<stdio.h>
int main(){
	int a,b;
	float s,d,k,m,n;
	printf("enter the two numbers :");
	scanf("%d%d",&a,&b);
	s=a-b;
	d=a/b;
	k=a+b;
	m=a*b;
	n=a%b;
	printf("sub=%.1f\n",s);
	printf("add=%.1f\n",k);
	printf("div=%.1f\n",d);
	printf("mul=%.1f\n",m);
	printf("mod=%.1f\n",n);
	
}
