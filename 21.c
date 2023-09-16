//WAP to obtain the sum of 1st and last digit from 4 digits number.

#include<stdio.h>

int main(){
	int n,a,b,R;
	printf("Enter the 4 digit number :\n");
	scanf("%d",&n);
	a=n/1000;
	b=n%10;
	R=a+b;
	printf("Addition of 1st and last digit is :%d\n",R);
}
