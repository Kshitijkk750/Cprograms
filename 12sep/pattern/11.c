//WAP for pattern
/*
1 2 3 4 5 6 7 8
1 2         7 8
1   3     6   8
1     4 5     8
1     4 5     8
1   3     6   8
1 2         7 8
1 2 3 4 5 6 7 8
*/
#include<stdio.h>

int main(){
    int i,j,n;
    for(i=1;i<=8;i++)
    {
        for(j=1;j<8;j++){
            
                for(n=j;n<=j;n++){
                    if(i==1||j==1||j==8||i==8 || i==j || i+j==9){
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
