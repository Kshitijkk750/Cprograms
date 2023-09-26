//WAP to swap the number 
#include <iostream>
using namespace std;


    void get(int *n,int *m ){
    *n=*n+*m;
    *m=*n-*m;
    *n=*n-*m;

    }


int main(){
    int a=6,b=9;
    cout<<"Before swapping :"<<a<<"\t"<<b;
    get(&a,&b);
    cout<<"\nAfter swapping :";
    cout<<a<<"\t"<<b;
    cout<<"\n";

}