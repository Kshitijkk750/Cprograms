#include<iostream>
using namespace std;

class first{
    private :
        int a;

    public :
        first(){
            a=18;
        }
        friend void add();
};
class second{
    private :
        int b;
    public :
        second(){
            b=12;
        }
        friend void add();
};
void add(){
    first f;
    second s;
    int c=f.a+s.b;
    cout<<"addition is :"<<c<<endl;
}
int main(){
    system("clear");
    add();
}