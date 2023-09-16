//WAp With return type without parameter.

#include<stdio.h>

int Add (void);
int main(){
    int ans;
    ans=Add();
    printf("Answers is :%d\n",ans);
}

int Add(void)
{
    int a,b,c;
    a=10,b=30;
    c=a+b;

    return c;    
}
