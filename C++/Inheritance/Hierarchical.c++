/*WAP take class student data member stu id and name
 get function to take inpiut and put function to display*/

 #include<iostream>
 using namespace std;

 class Student {
    protected :
        int stu_id;
        char name[20];
    public :
        void get(){
            cout<<"\nEnter the student id :";
            cin>>stu_id;
            cout<<"\nEnter the name of Student ;";
            cin>>name;
        }
        void put(){
            cout<<"\nStudent ID :"<<stu_id;
            cout<<"\nStudent Name :"<<name;
            
        }

 };
 class Science : public Student {
    private :
        char s1[20],s2[20],s3[20];
    public :
        void getin(){
            get();
            cout<<"\nEnter the Subjects :";
            cin>>s1>>s2>>s3;
        }
        void putin(){
            put();
            cout<<"\nSUB 1 "<<s1;
            cout<<"\nSUB 2 "<<s2;
            cout<<"\nSUB 3 "<<s3;
        }
        
 };
 class Commerce : public Student {
    private :
        char c1[20],c2[20],c3[20];
    public :
        void input(){
            get();
            cout<<"\nEnter three Subjects :";
            cin>>c1>>c2>>c3;
        }
        void output(){
            put();
            cout<<"\nSUB 1 :"<<c1;
            cout<<"\nSUB 2 :"<<c2;
            cout<<"\nSUB 3 :"<<c3;
        }

 };
 int main(){
    system("clear");
    
    Science s;
    s.getin();
    s.putin();
    Commerce c;
    c.input();
    c.output();
}