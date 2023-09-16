//WAP to check whether the character is vowel or consonant..

#include<stdio.h>

int main(){
	char ch;
	printf("enter the character :\n");
	scanf("%c",&ch);
	if(ch=='a' || ch=='e' ||ch=='i' || ch=='0' || ch=='u'|| ch=='A' || ch=='E' ||ch=='I' || ch=='O' || ch=='U'){
		printf("Entered character is vowel.\n");
	}
	else{
		printf("Entered character is not vowel .\n");
	}
}
