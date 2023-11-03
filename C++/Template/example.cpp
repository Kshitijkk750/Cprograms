//WAP 
#include<iostream>
using namespace std;
template <class T>
T add(T a,T b){
    return a+b;
}
int main(){
    int x,y,z;
    cout<<"enter the two values :";
    cin>>x>>y;
    z=add(x,y);
    cout<<"\n\nAddition is :"<<z<<endl;
}
