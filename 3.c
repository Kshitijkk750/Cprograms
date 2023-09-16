//WAP to calculate simple intrest(si=p*n*r)/100

#include<stdio.h>
int main(){
	float p,r,n,si;
	printf("enter the principal amount :");
	scanf("%f",&p);
	printf("enter the time ie number of years :");
	scanf("%f",&n);
	printf("enter the Rate of intrest :");
	scanf("%f",&r);
	printf("Formula for simple intrest is :\n si=(p*n*r)/100\n");
	si=(p*n*r)/100;
	printf("simple intrest is :%f\n",si);
}
