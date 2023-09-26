//WAP to take class inside the class and print the values which are user input..

#include<iostream>
using namespace std;

class Student{
    private :
     char sname[20];
     int sid;
    public :
        void get();
        void put();
    
    class address{
        private :
        char city[20],state[30];
        public :
            void in();
            void out();
    };

};
void Student::get(){
    cout<<"ENter the name os student :\t";
    cin>>sname;
    cout<<"Enter the student id :\t";
    cin>>sid;
    
}
void Student::put(){
    cout<<"Name of student is :"<<sname<<"\n";
    cout<<"student id is :"<<sid<<"\n";
}
void Student::address::in(){
    cout<<"enter the city name :\t";
    cin>>city;
    cout<<"enter the state name :\t";
    cin>>state;

}
void Student::address::out(){
    cout<<"city name is :\t"<<city<<"\n";
    cout<<"state name is :\t"<<state<<"\n";
}
int main(){
    Student s;
    Student::address a;
    s.get();
    a.in();
    s.put();
    a.out();

}