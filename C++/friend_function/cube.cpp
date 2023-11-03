//WAP to find cube of input number.

#include<iostream>
using namespace std;

class cube{
    private :
    int k;
    public :
        cube(){
            cout<<"Enter the number :";
            cin>>k;
        }
        friend void answer();
};
void answer(){
    int ans,ans2;
    cube c;
    ans=c.k*c.k*c.k;
    ans2=c.k*c.k;
    cout<<"Square of "<<c.k<<" is "<<ans2<<endl;
    cout<<"Cube of "<<c.k<<" is :"<<ans<<endl;
    
}
int main(){
    system("clear");
    answer();
}