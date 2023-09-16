//WAP to print even numbers from 1 to 10..
#include<stdio.h>

int main(){
	int n;
	for(n=1;n<=10;n++){
		if(n%2==0){
			printf("%d",n);
		}else{
			printf("\n");
		}
	}
}
