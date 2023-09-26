#include<iostream>
using namespace std;
 int main(){
    int arr[5],i,*p;
    p=arr;
    cout<<"enter the values :\n";
    for(i=0;i<5;i++){
        cin>>arr[i];
    }
    for(i=0;i<5;i++){
        cout<<"\t"<<*p<<"\t"<<p<<"\n";
    p++;
    }
    cout<<"\n";
 }