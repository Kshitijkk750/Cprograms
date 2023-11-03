//WAP for pattern.
/*
1 1 1 1 1
2       2
3       3
4       4
5 5 5 5 5
*/

#include<stdio.h>

int main(){
    int i,j,k=1,n=1;
    for(i=1;i<=5;i++)
    {
        for(j=1;j<5;j++){
            if(i==1||j==1||j==5||i==5){
            printf("%d ",n);
            }
            else{
                printf("  ");
            }
        }
        printf("%d\n",n);
        n++;
    }
}