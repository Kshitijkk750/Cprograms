// constructor types
#include<iostream>
using namespace std;

class demo
{
    private: int a,b;
    public:
        demo()//default constructor
        {
            a=10;
            b=20;
        }
        demo(int x, int y)//parameterized constructor
        {
            a=x;
            b=y;
        }
        demo(demo &ob)//copy constructor
        {
            a=ob.a;//d 10,20
            b=ob.b;
        }
        void show()
            {
                cout<<"\n value of A is :"<<a;
                cout<<"\n value of B is :"<<b;
            }
            ~demo()
            {
                cout<<"\n Destructor called......";
            }
        
};
int main(){
    demo d,d1(2,3),d3(d);
    d.show();
    d1.show();
    d3.show();
}
