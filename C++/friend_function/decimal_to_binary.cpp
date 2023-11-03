//WAP to convert decimal number to binary.

#include<iostream>
using namespace std;

class decimal{
    private :
    int a;
    public :
        decimal(){
            a=10;
        }
        friend void convert();
};
void convert(){
    decimal d;
    int i,j,temp;
    for(i=0;i<=1;i++){
        i=d.a%2;
        cout<<endl<<i<<endl;
        d.a=d.a/2;
        //cout<<d.a<<"\t";
        
    }
}
int main(){
    convert();
}