//WAP to find the given number is palindrome or not.

#include<stdio.h>

int main(){
	int a,r,temp,sum=0;
	printf("enter the number :\n");
	scanf("%d",&a);
	temp=a;
	while(a!=0){
		r=a%10;
		a=a/10;
		sum=(sum*10)+r;
	}
	if(temp==sum){
		printf("Palindrome\n");
	}else{
		printf("not Palindrome.\n");
	}
}
