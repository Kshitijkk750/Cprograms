/*WAP to design a class num number with data member n take input in a function.
Square class do square of number and take output.
cube class do cube of number and take output.*/

#include<iostream>
using namespace std;

class num{
    protected :
    int n;
    public :
        void get(){
            cout<<"ENter the number :\t";
            cin>>n;
        }

};
class square : public num{
    protected :
    int sq;
    public :
    void squ(){
        sq=n*n;
        cout<<"Square is :"<<sq;
    }
};
class cube : public square{
    private :
    int c;
    public :
    void cub(){
        c=sq*n;
        cout<<"\n cube is :"<<c;
    }
};
int main(){
    system("clear");
    cube j;
    j.get();
    j.squ();
    j.cub();

}



