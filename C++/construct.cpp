//WAP to print student name and roll number 
#include<iostream>
using namespace std;

class student
{
    private: int rollno;
    char name[20];
    string address;
    long long mob;
    public:
        student()//default constructor
        {
            cout<<"enter the student roll no:\t";
            cin>>rollno;
            cout<<"enter the name of student :\t";
            cin>>name;
            cout<<"enter the contact no :\t";
            cin>>mob;
            cout<<"enter the address :\t";
            cin>>address;
            
        }
        student(int rn, char n[20],string add,long long mo)//parameterized constructor
        {
            rn=rollno;
            n=name;
            add=address;
            mo=mob;
        }
        
        void show()
            {
            cout<<"roll no is :"<<rollno<<"\n";
            cout<<"student name is :"<<name<<"\n";
            cout<<"student contact number :"<<mob<<"\n";
            cout<<"Address is :"<<address<<"\n";
            }
            
        
};
int main(){
    student s,s1;
    s.show();
    s1.show();
    
}