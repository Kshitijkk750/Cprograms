// WAP for printinf specific element by using the row and column..
#include<stdio.h>

int main(){
    int i,j,k,l;
    int a[3][3];
    int sum=0;
    printf("enter the elements :\n");
    for(i=0;i<3;i++){
        for(j=0;j<3;j++){
            scanf("%d",&a[i][j]);
        }
        //scanf("%d",&a[j]);
    }
    printf("Elements are:\n");
    for(i=0;i<3;i++){
        for(j=0;j<3;j++){
            printf(" %d\t",a[i][j]);
        }
        printf("\n");
    }
    printf("enter the index no form which you have to print the element ");
    scanf("%d%d",&k,&l);
    printf("specific element is:\t");
    for(i=0;i<3;i++){
        for(j=0;j<3;j++){
            if(i==k && j==l){
                printf("\n%d\n",a[i][j]);
            }
        }
    }           

}