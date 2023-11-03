//WAP tp reverse the number.
#include<iostream>
using namespace std;
int main(){
    int r,sum=0,n;
    cout<<"enter the number :";
    cin>>n;

    while(n!=0){
        r=n%10;
        sum=(sum*10)+r;
        n=n/10;
    }
    cout<<"reverse number is :"<<sum<<"\n";
}