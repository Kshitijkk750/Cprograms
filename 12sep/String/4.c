// wap to print string and reverse it.

#include <stdio.h>
int main()
{
    char str[20],n;

    int i;
    printf("Enter the string :\n");
    scanf("%s", str);
    for (i = 0; str[i] != '\0'; i++)
    {
        
    }
    printf("Length of the string is :%d\n",i);
    n=i;
    printf("reverse string is :");
    for(i=n-1;i>=0;i--){
        printf("%c",str[i]);
        
    }
    printf("\n");
}

/*
OUTPUT:
Enter the string :
kshitij
Length of the string is :7
reverse string is :jitihsk
*/
