//wap to print 2D array.

#include<stdio.h>

int main(){
    int i,j;
    int a[2][2];
    printf("enter the elements :\n");
    for(i=0;i<2;i++){
        for(j=0;j<2;j++){
            scanf("%d",&a[i][j]);
        }
        //scanf("%d",&a[j]);
    }
    printf("Elements are:\n");
    for(i=0;i<2;i++){
        for(j=0;j<2;j++){
            printf(" %d\t",a[i][j]);
        }
        printf("\n");
    }
}