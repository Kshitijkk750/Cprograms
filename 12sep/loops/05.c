//WAP to calculate the factorial of a number.

#include<stdio.h>

int main(){
	int n,f=1;;
	printf("enter the number:\n");
	scanf("%d",&n);
	while(n>=1){
		f=f*n;
		n--;
	}
	printf("factorial is :%d\n",f);
}
