//WAP to find the entered number is armstrong or not.

#include<stdio.h>

int main(){
	int n,c,r,sum=0,temp;
	printf("enter the number :\n");
	scanf("%d",&n);
	temp=n;
	while(n!=0){
		r=n%10;
		c=r*r*r;
		sum=sum+c;
		n=n/10;
	}
	if(sum==temp){
		printf("number is armstrong.\n");
	}else{
		printf("number is not armstrong..\n");
	}
	
}
