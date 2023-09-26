//WAP to create two classes and Take function
#include<iostream>
using namespace std;

class A{
    private :
    int a;
    public :
        int  get (){
            cout<<"Enter value of a :\t";
            cin>>a;
            return a;
        }
};
class B{
    private :
    int b;
    public :
        int getin(){
            cout<<"enter the value of b :\t";
            cin>>b;
            return b;
        }
};
class c :public A,public B{
    private :
        int c,x,y;
        public :
            void add(){
               x=get();
                y=getin();
                c=x+y;
                //c=a+b;
                cout<<c<<"\n";
            }
};
int main(){
    c j;
    j.add();
}