//WAP to define function overloading

#include<iostream>
using namespace std;

class kk{
    private :
    int a,b,c;
    public :

        void add(int a,int b)
        {
            int c;
            c=a+b;
            cout<<endl<<c<<endl;
        }
        void add(int k,int l,int n){
            int m;
            m=k+l+n;
            cout<<m<<endl;
        }
};
int main(){
    kk m;
    int x,y,z;
    cout<<"enter the values :";
    cin>>x>>y>>z;
    m.add(x,y);
    m.add(x,y,z);
}