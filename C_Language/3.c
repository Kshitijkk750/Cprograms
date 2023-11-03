//WAP to find entered number is even or odd .

#include<stdio.h>

int main(){
	int n;
	printf("Enter the number :\n");
	scanf("%d",&n);
	if(n%2==0){
		printf("number is even.\n");
	}
	else{
		printf("number is odd.\n");
	}
}
