//WAP to create two classes and Take function
#include<iostream>
using namespace std;

class A{
    protected :
    int a;
    public :
        void get (){
            cout<<"Enter value of a :\t";
            cin>>a;
        }
};
class B{
    protected :
    int b;
    public :
        void getin(){
            cout<<"enter the value of b :\t";
            cin>>b;
        }
};
class c :public A,public B{
    private :
        int c;
        public :
            void add(){
                
                c=a+b;
                cout<<c<<"\n";
            }
};
int main(){
    c c;
    c.get();
    c.getin();
    c.add();
}