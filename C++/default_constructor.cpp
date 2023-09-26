#include<iostream>
using namespace std;
class rectangle{
    private :
        int l,b;
    public :
        rectangle(){
            cout<<"enter the length and breadth of rectangle :\t";
            cin>>l>>b;
        }
        void area(){
            int a=l*b;
            cout<<"\n Area of rectangle is :"<<a;
        }
};
int main(){
    rectangle r;
    r.area();
}