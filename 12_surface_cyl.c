//WAP to calculate the surface of cylinder.(2*pi*r*h)..

#include<stdio.h>

int main(){
	float p=3.14,r,h,R;
	printf("Enter the radius and height of the cylinder :\n");
	scanf("%f%f",&r,&h);
	R=2*p*r*h;
	printf("Surface of cylinder is :%f\n",R);
}
