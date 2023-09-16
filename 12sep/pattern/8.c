//WAP for pattern
/*
1  
1 2  
1 2 3  
1 2 3 4  
1 2 3 4 5 
*/

#include<stdio.h>

int main(){
    int i,j,k=1;
    for(i=1;i<=5;i++)
    {
        for(j=1;j<=i;j++){
            for(k=j;k<=j;k++)
            printf("%d ",k);
    }
    printf(" \n");
}
}