//WAP to increment and decrement of operator overloading..

#include<iostream>
using namespace std;

class over{
    private :
    public :
        int a,b;
        void operator ++(){
            cout<<"enter the number :";
            cin>>a>>b;
            a++;
            b++;
            cout<<"increment is :"<<a<<"\t"<<b;
            cout<<"\n\n";
        }
        void operator --(){
            cout<<"Decrement is :";
            a--;
            b--;
            cout<<a<<"\n"<<b<<"\n";

        }
};
int main(){
    system("clear");
    over o;
    o.operator++();
    o.operator--();
}