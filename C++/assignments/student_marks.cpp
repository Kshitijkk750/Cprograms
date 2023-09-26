/*
Define a class student with the following specification
Private members of class student
admno integer
sname 20 character
eng. math, science float
total float
ctotal() a function to calculate eng + math + science with float return
type.
Public member function of class student
Takedata() Function to accept values for admno, sname, eng, science and
invoke ctotal() to calculate total.
Showdata() Function to display all the data members on the screen
*/

#include <iostream>
using namespace std;
class student
{
private:
    int admno;
    char sname[20];
    float eng, math, science;
    float total;
    float ctotal()
    {
        total = math + eng + science;
        return total;
    }

public:
    void takedata()
    {
        cout << "Enter the admission number :";
        cin >> admno;
        cout << "Enter the name of student :";
        cin >> sname;
        cout << "Enter the marks of maths, eng and science :";
        cin >> math >> eng >> science;
        ctotal();
    }
    void showdata()
    {
        cout << "Student admmision number :\t" << admno;
        cout << "\nStudent name :\t" << sname;
        cout << "\nmarks in math :" << math << "\nmarks in eng :" << eng << "\nmarks in science :" << science;
        cout << "\ntotal marks :\t" << total << "\n";
    }
};
int main()
{
    system("clear");
    student s;
    s.takedata();
    s.showdata();
}