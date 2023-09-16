//WAP toto calculate the sum of individual digits of 4digit number (d1=n%10;n=n/10
/*k1=n%10;
	k2=n/10;
	l1=k2%10;
	l2=k2/10;
	m1=l2%10;
	m2=l2/10;
	n1=m2%10;
	n2=m2/10;
	A=k1+l1+m1+n1;
	printf("Addition is :%d\n",A);*/
	//above is the detail calculation.....
#include<stdio.h>

int main(){
	//int k1,k2,l1,l2,m1,m2,n1,n2,n,A;
	int n,a,b,c,d,r;
	printf("Enter the 4 digit number ;\n");
	scanf("%d",&n);
	a=n/1000;
	b=n/100%10;
	c=n/10%10;
	d=n%10;
	r=a+b+c+d;
	printf("Result is :%d\n",r);
		
}
