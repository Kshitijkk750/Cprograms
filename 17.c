// WAP to compute quotient and remainder..

#include<stdio.h>

int main(){
	int a,b,Q,R;
	printf("Enter the two values :\n");
	scanf("%d%d",&a,&b);
	printf("Quotient of the given numbers is :\t");
	Q=a/b;
	printf("%d\n",Q);
	printf("Remainder of the given numbers is :\t");
	R=a%b;
	printf("%d\n",R);
}
