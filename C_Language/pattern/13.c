//WAP for pattern.
/*
A B C D E  
F G H I  
J K L  
M N  
O  
*/

#include<stdio.h>

int main(){
    int i,j;
    char ch='A';
    for(i=1;i<=5;i++)
    {
        for(j=5;j>=i;j--){
            if(i<=j){
            printf("%c ",ch);
            ch++;
            }
            else {
                printf(" ");
            }
    }
    printf(" \n");
}
}