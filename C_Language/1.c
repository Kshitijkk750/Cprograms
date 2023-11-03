//WAP to compare two numbers .

#include<stdio.h>

int main(){
	int a,b,c;
	printf("Enter the three numbers to compare :\n");
	scanf("%d%d%d",&a,&b,&c);
	if(a>b && a>c){
	printf(" %d is greater than %d and %d\n",a,b,c);
	}
	else if(b>c && b>a){
		printf("%d is greater than %d and %d\n",b,a,c);
	}
	else{
		printf("%d is greater than %d and %d\n",c,a,b);
	}
}


