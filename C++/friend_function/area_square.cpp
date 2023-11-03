#include<iostream>
using namespace std;

class first{
    private :
    int l;
    public :
        first(){
            cout<<"enter the length :";
            cin>>l;

        }
        friend void area();
};
class second{
    private :
    int b;
    public :
        
        second(){
            cout<<"enter the breadth :";
            cin>>b;

        }
        friend void area();

};
void area(){
    first f;
    second s;
    int area_square,area_rectangle ;
    area_square= f.l*f.l;
    area_rectangle=f.l*s.b;
    cout<<"Area of Square is :"<<area_square<<endl;
    cout<<"Area of Rectangle is :"<<area_rectangle<<endl;
}
int main(){
    system("clear");
    area();
}