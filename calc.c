//Calculator using Switch case..

#include<stdio.h>
int main(){
int c,a,b,R;
	printf("Enter the coice :\n");
	printf("1.SUbtraction\n2.Addition\n3.Division\n4.Multiplication\n");
	scanf("%d",&c);
	switch (c){
		case 1: 
			printf("SUBTRACTION \n");
			printf("enter the two numbers :");
			scanf("%d%d",&a,&b);
			R=a-b;
			printf("Result is :%d\n",R);
			break;
		case 2:
			printf("ADDITION\n");
			printf("enter the two numbers :");
			scanf("%d%d",&a,&b);
			R=a+b;
			printf("Result is :%d\n",R);
			break;
		case 3: 
			printf("DIVISION\n");
			printf("enter the two numbers :");
			scanf("%d%d",&a,&b);
			R=a/b;
			printf("Result is :%d\n",R);
			break;
		case 4:
			printf("MULTIPLICATION\n");
			printf("enter the two numbers :");
			scanf("%d%d",&a,&b);
			R=a*b;
			printf("Result is :%d\n",R);
			break;
		default :
			printf("Error in choice...");
	}
}
