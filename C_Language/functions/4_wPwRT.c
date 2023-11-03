//WAP with return type with parameter.

#include<stdio.h>

int Add(int,int);
int main(){
    int a,b,c,d,k;
    printf("enter the numbers :\n");
    scanf("%d%d",&a,&b);
    c=Add(a,b);
    d=Sub(a,b); 
    printf("Addition is :%d\n",c);
    printf("Subtraction is :%d",d);
    k=c+d;
    printf("%d",k);
    //printf("Subtraction is :%d\n",d);

}
int Add(int x,int y)
{
    int sum;
    sum=x+y;

    return sum;
}
 int Sub(int k, int l)
{
    int sub;
    sub=k-l;
    return sub;
    
}

