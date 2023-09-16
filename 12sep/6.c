// greater number /

#include<stdio.h>

int main(){
	int a,b,c,d,e;
	printf("enter the 5 numbers:\n");
	scanf("%d%d%d%d%d",&a,&b,&c,&d,&e);
	
	if(a>b&&a>c&&a>d&a>e){
		printf("a is greater\n");
	}
		else if(b>c&&b>d&&b>e){
			printf("b is greater.\n");
			}
			else if(c>d&&c>e){
				printf("c is greater.\n");
			}
				else if(d>e){
					printf("d is greater");
				}
					else {
						printf("e is greater.\n");
					}
}
