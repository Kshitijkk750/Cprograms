// WAP to print the specific element .1d array.
#include<stdio.h>

int main(){
    int i,k,n;
    int a[50];
    printf("enter the number of elements in array :\n");
    scanf("%d",&n);
    printf("enter the elements :\n");
    for(i=0;i<n;i++){
        
            scanf("%d",&a[i]);
    }
    printf("Elements are:\n");
    for(i=0;i<n;i++){
        
            printf(" %d\t",a[i]);
            }
    printf("\nenter the position from which you want to print element : ");
    scanf("%d",&k);
    printf("specific element is:\t");
    for(i=0;i<n;i++){
            if(i==k){
                printf("%d\n",a[i]);
            }
        
    }           

}