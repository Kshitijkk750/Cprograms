//WAP to find area of circle and rectangle.

#include<iostream>
using namespace std;

float area(int);
int area(int, int);

int main(){
    area(5);
    area(4,8);
    cout<<"area of circle is :"<<area(5)<<"\n";
    cout<<"area of rectangle is :"<<area(4,8)<<"\n";

}
float area(int r){
    float p=3.14,a;
    a=p*r*r;
    return a;
}
int area(int l,int b){
    int a;
    a=l*b;
    return a;
}