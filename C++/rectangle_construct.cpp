//WAP calculate area and perimeter of rectangle using constructor..

#include<iostream>
using namespace std;

class rectangle{
    private :
        int l,b;
    
    public :
    
        rectangle(){
            cout<<"Enter the length and breadth of rectangle :\t";
            cin>>l>>b;

        }
        rectangle(int a,int c ){
            
            l=a;
            b=c;
        }
        void area(){
            int area;
            area=l*b;
            cout<<"Area of rectangle is :\t"<<area;
        }
        
        
};
int main(){
    rectangle r;
    r.area();
    //r1.area();
}