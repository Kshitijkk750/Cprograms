//WAP to print the sum of individual five digit number..

#include<stdio.h>

int main(){
	int n,sum=0,m;
	printf("enter the five digit number :\n");
	scanf("%d",&n);
	while(n!=0){
		m=n%10;
		sum=sum+m;
		n=n/10;
	}
	printf("sum is :%d\n",sum);
}
