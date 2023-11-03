//wap to addition of  2D array.
//i0j1 + i1j0 + i1j2 + i2j1= Sum.

#include<stdio.h>

int main(){
    int i,j;
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
    printf("Addition is:\t");
    for(i=0;i<3;i++){
        for(j=0;j<3;j++){
            if(i+j==1||i+j==3){
                sum=sum+a[i][j];
            }
        }
    }
            printf("%d\n",sum);

}