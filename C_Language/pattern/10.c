//WAP for pattern
/*
1 2 3 4 5
1       5
1       5
1       5
1 2 3 4 5
*/

#include<stdio.h>

int main(){
    int i,j,n=1;
    for(i=1;i<=5;i++)
    {
        for(j=1;j<5;j++){
            
                for(n=j;n<=j;n++){
                    if(i==1||j==1||j==5||i==5){
                    printf("%d ",n);
            }
            else{
                printf("  ");
            }
                }
            
        }
        printf("%d\n",n);
    }
}