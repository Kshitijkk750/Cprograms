//structure example. scope resolutions..
#include<iostream>
using namespace std;

class student{
    int prn_no;
    char name[20];
    public:
    void get();
    void put();
};
void student::get(){
    cout<<"enter the prn number and name  of student : ";
    cin>>prn_no>>name;
}
void student:: put(){
    cout<<"prn number is :"<<prn_no<<"\n";
    cout<<"student name is :"<<name<<"\n";
}
//}
int main(){
    student s[2];
    for(int i=0;i<2;i++){
        s[i].get();
        s[i].put();
    }
    
}