//WAP to calculate total and average of 5 subjects..

#include<stdio.h>
int main(){
	int b,c,d,e,t,f;
	float a;
	printf("Enter the marks of 5 subjects :\n");
	scanf("%d%d%d%d%d",&b,&c,&d,&e,&f);
	t=b+c+d+e+f;
	printf("\nTotal marks is :%d\n",t);
	a=(b+c+d+e+f)/5;
	printf("Average is :%f\n",a);
	
}
