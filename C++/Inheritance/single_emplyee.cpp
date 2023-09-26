//WAP 

#include<iostream>
using namespace std;

class employee{
    private :
        char name[20];
        int sal;
    public :
        void get ()
        {
            cout<<"Enter the Name of Emplyee :";
            cin>>name;
            cout<<"Enter the Salary of Employee :";
            cin>>sal;
        }
        void put(){
            cout<<"\nName of Employee :"<<name<<endl;
            cout<<"Salary of "<<name<<" :"<<sal<<endl;
        }
};
class Salary : public employee{
    private :
    public :
    void display(){
        get();
        put();
        cout<<"End of program!!!!";
    }
};
int main(){
    Salary s;
    s.display();
}
