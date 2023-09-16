//WAP for multiple task..

#include<iostream>
using namespace std;
int add(int,int);
int sub(int,int);
float div(float,float);
int mul(int,int);
int main(){
    float x,y,ans1,ans2,ans3,ans4;

    // float x,y,ans1,ans2,ans3,ans4;
    cout<<"enter the two number :";
    cin>>x>>y;
    ans1=add(x,y);
    cout<<"Addition is:"<<ans1<<"\n";

    ans2=sub(x,y);
        cout<<"Subtraction is :"<<ans2<<"\n";

    ans3=div(x,y);
       cout<<"Division is :"<<ans3<<"\n";

    ans4=mul(x,y);
            cout<<"Multiplication is :"<<ans4<<"\n";

}
int add( int a,int b){
int c;
c=a+b;
    return c;
}
int sub(int a, int b){
    int c;
    c=a-b;
    return c;
}
int  mul(int a,int b){
    int c;
    c=a*b;
    return c;
}
 float div(float a, float b){
    float c;
    c=a/b;
    return c;
}

