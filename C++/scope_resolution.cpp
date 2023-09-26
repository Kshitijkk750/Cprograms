//WAP to calculate area perimeter of reectangle.

#include<iostream>
using namespace std;

class rectangle{
    private :
    float l,b;
    public :
    void input();
    void area();
    void perimeter();
};

void rectangle ::input(){
    cout<<"Enter the length :";
    cin>>l;
    cout<<"Enter the breadth :";
    cin>>b;
}
void rectangle ::area(){
    float area;
    area=l*b;
    cout<<"Area of rectangle :"<<area<<"\n";

}
void rectangle ::perimeter(){
    float perimeter;
    perimeter=((2*l)+(2*b));
    cout<<"Perimeter of rectangle is :"<<perimeter<<"\n";
}

int main(){
    rectangle r;
    r.input();
    r.area();
    r.perimeter();
}