#include<iostream>
using namespace std;

int fact(int);
int main(){
    int n,s;
    s=fact(n);

}
int fact(int a){
    int fac=1;
    cout<<"enter the number :";
    cin>>a;
    for (int i=1;i<=a;i++){
        fac=fac*i;
    }
    cout<<"factorial of number is : "<<fac<<"\n";
    return fac;
}