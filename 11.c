//Calculator

#include<stdio.h>
int main()
{
	int a,b,n,R;
	
	printf("select any one operation from the list.\n");
	printf("1.Addition\n2.Subtraction\n3.Division\n4.Multiplication\n");
	scanf("%d",&n);
	if(n==1)
	{
		printf("ADDITION \n");
		printf("Enter the two numbers :");
		scanf("%d\t%d",&a,&b);
		R=a+b;
		printf("Result is :%d \n",R);
		
	}
	else if(n==2)
	{
		printf("SUBTRACTION \n");
		printf("Enter the two numbers :");
		scanf("%d\t%d",&a,&b);
		R=a-b;
		printf("Result is :%d \n",R);
	}
	else if(n==3)
	{
		printf("DIVISION\n");
		printf("Enter the two numbers :");
		scanf("%d\t%d",&a,&b);
		R=a/b;
		printf("Result is :%d \n",R);
	}
	else if(n==4)
	{
		printf("MULTIPLICATION\n");
		printf("Enter the two numbers :");
		scanf("%d\t%d",&a,&b);
		R=a*b;
		printf("Result is :%d \n",R);
		
	}
	else{
		printf("Invalid Choice..\n");
	}
}

