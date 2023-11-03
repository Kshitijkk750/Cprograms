//WAP to convert celcius to fahrenheit and vice versa..
//celcius=((Farhenheit-32)/(1.8))
//Fahrenheit=(1.8*Celcius)+32.

#include<stdio.h>

int main(){
	int n;
	float f,c,R;
	printf("Enter the choice :\n");
	printf("1.Celcius to Fahrenheit\n2.Fahrenheit to Celcius\n");
	scanf("%d",&n);
	switch (n){
		case 1:
			printf("\nCelcius to Fahrenheit\n");
			printf("Enter the Temperature in Celcius:\n");
			scanf("%f",&c);
			R=(1.8*c)+32;
			printf("Celcius to Fahrenheit temperature is :%f\n",R);
			break;
		case 2:
			printf("\nFahrenheit to Celcius \n");
			printf("Enter the Temperature in Fahrenheit:\n");
			scanf("%f",&f);
			R=((f-32)/(1.8));
			printf("Fahrenheit to Celcius temperature is :%f\n",R);
			break;
		default :
			printf("Invalid choice...");
			
	}
}
