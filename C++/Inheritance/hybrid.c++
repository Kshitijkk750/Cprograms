//WAP 
#include<iostream>
using namespace std;

class Student{
    protected :
    int stu_id;
    char name [20];
    public :
        void get (){
            cout<<"\nEnter the name od Student :";
            cin>>name;
            cout<<"\nEnter the student id :";
            cin>>stu_id;
        }
        void put(){
            cout<<"\nName os Student : "<<name;
            cout<<"Student id : "<<stu_id;
        }
};
class test : public Student{
    protected :
    int m1,m2,m3;
    public :
        void getin(){
            get();
            cout<<"Enter the Marks :";
            cin>>m1>>m2>>m3;
        }
        void putin(){
            put();
            cout<<"marks are :";
            cout<<m1<<"\t"<<m2<<"\t"<<m3<<"\n";

        }
};
class sports : public Student{
    protected :
        int s1;
    public :
        void input (){
            cout<<"\nEnter the marks in sports :";
            cin>>s1;
        }
        void output(){
            
            cout<<"marks in sports :";
            cout<<s1;
        }
};
class result : public test, public sports{
    protected :
        int total;
    public :
       
        void totalm(){  
            getin();
            input();
             putin(); 
             output();

            cout<<" \ntotal Marks are :\n";
            total= m1+m2+m3+s1;

        }
        void totalmarks(){
            cout<<total;
            cout<<endl;
        }
};
int main(){
    system("clear");
    result r;
    r.totalm();
    r.totalmarks();

}