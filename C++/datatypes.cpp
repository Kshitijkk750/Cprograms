//WAP tp print different datatypes.
#include<iostream>
using namespace std;

int print(int);
float print(float);
char print(char);

int main(){
    int a,a1;
    float b,b1;
    char c,c1;
    cout<<"enter the different values of integer float and character :";
    cin>>a>>b>>c;
    a1=print(a);
    b1=print(b);
    c1=print(c);
    // cout<<"float value is :"<<b;
    // cout<<"character value is :"<<c;

}
int print( int a){

    cout<<a<<"\n";
    // cout<<"integer value is :"<<a;
    return a;
}
float print( float f){
    cout<<f<<"\n";
    return f;
}
char print(char g){
    cout<<g<<"\n";
    return g;
}