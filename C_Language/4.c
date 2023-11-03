//WAP to check greater of 4 numbers.

#include<stdio.h>

int main(){
	int a,b,c,d;
	printf("enter the 4 numbers to compare :\n");
	scanf("%d%d%d%d",&a,&b,&c,&d);
	if(a>b){
		if(a>c){
			if(a>d){
				printf("a");
			}
			else{
				printf("d");
			}
		}
		else {
			if(c>d){
			printf("c");
			}
			else{
				printf("d");
			}
		}
	}
	else {
		if(b>c){
			if(b>d){
				printf("b");
			}
			else{
				printf("d");
			}
		}
		else {
			if(c>d){
				printf("c");
			}
			else{
			printf("d");
		}
	
}
}
}
	
	

