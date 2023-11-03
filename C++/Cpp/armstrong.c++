//WAP to fing the number is armstrong or not.

#include<iostream>
using namespace std;

int main(){
    int n,r,sum=0,c,temp;
    cout<<"Enter the number :";
    cin>>n;
    temp=n;
    while(n!=0){
    r=n%10;
    c=r*r*r;
    sum=sum+c;
    n=n/10;
    }
    if(sum==temp){
        cout<<" number is armstrong.\n";

    }else {
        cout<<"number is not armstrong.\n";
    }
}