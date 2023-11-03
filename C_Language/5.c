/*WAP to check whether a number is divisible according to the following condition.
1.no. is divisible by 8 and 5.
2.no. is divisible by 8.
3. no. is divisible by 5.
4. no is divisible neither by 8 nor 5.*/

#include<stdio.h>

int main(){
	int n;
	printf("Enter the number :");
	scanf("%d",&n);
	
	if(n%8==0){
		if(n%5==0){
			printf(" number is divisible by 8 and 5.\n");
		}
		else{
			printf("number is divisible by 8.\n");
		}
		}
	else if(n%5==0){
			printf("number is divisible by 5.\n");
		}
		else {
			printf("number is divisible neither by 8 nor 5.\n");
		}
	
}
