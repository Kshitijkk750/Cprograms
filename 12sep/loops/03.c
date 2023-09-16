//WAP to print even numbers from 1 to 10.

#include<stdio.h>

int main(){
	int n=1;
	while(n<=10){
		if(n%2==0){
			printf("%d\n",n);
		}
		n++;
	}
}
