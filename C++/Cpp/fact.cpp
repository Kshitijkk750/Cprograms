//WAP to find factorial of number.

#include<iostream>
using namespace std;

int main(){
int i,n,fact=1;
cout<<"enter the number :\n";
cin>>n;
for(i=1;i<=n;i++){
    fact=fact*i;
}
cout<<"Factorial of number is :"<<fact<<"\n";

}