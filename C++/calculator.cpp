//WAP to add sub mul div using same function with different datatypes...(function Overloading)

#include<iostream>
using namespace std;
int add(int, int,int);
int sub(int, int);
float divi(float , float);
float mul(int, float);
int main(){
    int ad,su;
    float di,mu;
    ad=add(10,5,4);
    su=sub(10,5);
    di=divi(50,10);
    mu=mul(5,10.0);
    
    cout<<"addition is :"<<ad<<"\n";
    cout<<"subtraction is :"<<su<<"\n";
    cout<<"division is :"<<di<<"\n";
    cout<<"multiplication is :"<<mu<<"\n";
    

}
int add(int a,int b,int c){
    int add;
    add=a+b+c;
    return add;
}
int sub(int c, int d){
    int sub;
    sub=c-d;
    return sub;
}
float divi(float k,float m){
    float div;
    div=k/m;
    return div;
}
float mul(int x,float y){
    float mul;
    mul=x*y;
    return mul;
}