//WAP to find the number is prime or not..

#include<stdio.h>

int main(){
	int n,i=2,c=0;
	printf("enter the number:\n");
	scanf("%d",&n);
	while(i<n){
	 if(n%i==0){
	 	c++;
	 	}
	 	i++;
	 	}
		if(c==1){
			printf(" NotPrime\n");
			
		}else{
			printf(" prime");
		}
	 	
	 	
	 
	
}
