//WAP for pattern
/*
1 2 3 4 5  
1 2 3 4  
1 2 3  
1 2  
1  
*/
#include<stdio.h>

int main(){
    int i,j,k=1;
    for(i=1;i<=5;i++)
    {
        for(j=5;j>=1;j--){
            
                for(k=1;k<=j;k++){
                     if(i>=j){
                        printf("%d ",k);
                }
            
                     else {
                printf(" ");
            }
                }
                
            
                printf(" \n");
            
    }
    printf(" \n");
}
}
