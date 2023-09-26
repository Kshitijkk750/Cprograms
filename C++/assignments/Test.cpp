/*
Define a class TEST in C++ with following description:
Private Members
TestCode of type integer
Description of type string
NoCandidate of type integer
CenterReqd (number of centers required) of type integer
A member function CALCNTR() to calculate and return the number of centers as
(NoCandidates/100+1)
Public Members
- A function SCHEDULE() to allow user to enter values for TestCode, Description,
NoCandidate & call function CALCNTR() to calculate the number of Centres
- A function DISPTEST() to allow user to view the content of all the data members
*/

#include <iostream>
using namespace std;
class TEST
{

private:
    int TestCode, NoCandidate, CenterReqd, no_centers;
    string Description;

    int CALCNTR()
    {
        no_centers = (NoCandidate / 100 + 1);
        return no_centers;
    }

public:
    void SCHEDULE()
    {
        cout << "\nEnter the no. of testcode :\t";
        cin >> TestCode;
        cout << "\nEnter the  Description :\t";
        cin >> Description;
        cout << "\nEnter the number of candidates :\t";
        cin >> NoCandidate;
        CALCNTR();
    }
    void DISPTEST()
    {
        cout << "Number of testcodes :\t" << TestCode << "\n";
        cout << "Description :\t" << Description << "\n";
        cout << "Number of candidates :\t" << NoCandidate << "\n";
        cout << "number of centers :\t" << no_centers << "\n";
    }
};
int main()
{
    system("clear");
    TEST t;
    t.SCHEDULE();
    t.DISPTEST();
}