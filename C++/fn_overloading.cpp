//WAP function overloading.

#include<iostream>
using namespace std;

int add(int, int);
int add(int, int,int);
float add(int, float);

int main(){
    int a,b,c;
    float d;
    cout<<"enter the values:";
    cin>>a>>b>>c>>d;
    add(a,b);
    add(a,b,c);
    add(a,d);
    
}
int add(int a,int b){
    int c;
    // cout<<"enter the values:";
    // cin>>a>>b;
    c=a+b;
    cout<<"addition is :"<<c<<"\n";
    return c;

}
int add(int k, int l,int m){
    int n;
    // cout<<"enter the values:";
    // cin>>k>>l>>m;
    n=k+l+m;
    cout<<"addition is :"<<n<<"\n";
    return n;
}
float add(int x, float y){
    float z;
    // cout<<"enter the values:";
    // cin>>x>>y;
    z=x+y;;
    cout<<"addition is :"<<z<<"\n";
    return z;
}