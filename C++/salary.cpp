//WAP and take class name employee with two data members emp name and id and take two fumction for input and output.

#include<iostream>
using namespace std;
 class Employee{
    private :
    string name, eid;
    float sal, Gsalary;
    public :

    void input(){
        cout<<"Enter the name of employee :\t";
        cin>>name;
        cout<<"Enter the employee id :\t";
        cin>>eid;
        cout<<"Enter the Salary of Employee :\t";
        cin>>sal;
    }
    void output(){
        cout<<"Employee name :\n"<<name<<"\n";
        cout<<"Employee id :\n"<<eid<<"\n";
        cout<<"Employee Salary is : "<<sal<<"\n";
    }
    void salary(){
        float hra=0.4,HRA;
        float pf=0.8,PF;
        // cout<<"Enter the HRA in percent :\t";
        // cin>>hra;
        // cout<<"Enter the PF in percent:\t";
        // cin>>pf;
        HRA=((hra/sal)*100);
        PF=((pf/sal)*100);
        cout<<HRA<<"\t"<<PF;
        cout<<"Gross Salary of employee is : ";
        Gsalary=((sal +HRA)-PF);
        cout<<Gsalary<<"\n";

    }
 };
 int main(){
    Employee e;
    e.input();
    e.output();
    e.salary();
 }