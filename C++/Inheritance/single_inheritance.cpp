//WAP of single inheritance..
#include<iostream>
using namespace std;

class Base{
    private :
     int a,b;
    public :
        void get(){
            cout<<"Enter the numbers :";
            cin>>a>>b;
        }
        void show(){
            cout<<a<<"\t";
            cout<<b<<"\n";
        }

};
class Derive:private Base{
    private :
    public :
    void display(){
        get();
        show();
        cout<<"Call of base function..";
    }
};
int main(){
    system("clear");
    Derive d;
    //d.get();
    //d.show();
    d.display();
}