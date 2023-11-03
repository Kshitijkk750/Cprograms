//WAP to calculate the third angle when two angles are input through the keyboard..

#include<stdio.h>

int main(){
	int a,b,c,t=180;
	printf("Enter the two angles :");
	scanf("%d%d",&a,&b);
	c=t-(a+b);
	printf("third angle is : %d\n",c);
}
