#include<iostream>
using namespace std;

template <class T>
// void swap(T*a,T*b){
//     *a=*a+*b;
//     *b=*a-*b;
//     *a=*a-*b;
// }
// int main(){
//     int x=4,y=8;
//     cout<<"Before swapping :"<<x<<"\t"<<y;
//     swap(x,y);
//     cout<<"\nAfter swapping :"<<x<<"\t"<<y;
// }

int swap(T a,T b){
    a=a+b;
    b=a-b;
    a=a-b;
    return a;
    return b;
}
    int main()
    {
        int x=8,y=5;
        cout<<"Before swapping :"<<x<<"\t"<<y;
        int swap(x,y);
        cout<<"after swapping :"<<x<<"\t"<<y;
        
    }
