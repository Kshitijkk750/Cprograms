/*
Define a class REPORT with the following specification:
Private members :
adno 4 digit admission number
name 20 characters
marks an array of 5 floating point values
average average marks obtained
GETAVG() a function to compute the average obtained in five subject
Public members:
READINFO() function to accept values for adno, name, marks. Invoke the
function GETAVG()
DISPLAYINFO() function to display all data members of report on the screen.
You should give function definitions.
*/

#include <iostream>
using namespace std;

class REPORT
{
private:
    int adno;
    char name[20];
    float marks[5];
    float average;
    void GETAVG()
    {
        float sum = 0;
        for (int i = 0; i < 5; i++)
        {
            sum = sum + marks[i];
        }
        average = sum / 5;
    }

public:
    void READINFO()
    {
        cout << "\nEnter Admission number :\t";
        cin >> adno;
        cout << "\nEnter the name:\t";
        cin >> name;
        cout << "\nEnter marks for 5 subjects :\t";
        for (int i = 0; i < 5; i++)
        {
            cin >> marks[i];
        }
        GETAVG();
    }
    void DISPLAYINFO()
    {
        cout << "\nAdmission number :\t" << adno;
        cout << "\nname :\t" << name;
        cout << "\n marks for 5 subjects :\t";
        for (int i = 0; i < 5; i++)
        {
            cout << "\n"
                 << marks[i];
        }
        cout << "Average marks :\t" << average << "\n";
    }
};
int main()
{
    system("clear");
    REPORT r;
    r.READINFO();
    r.DISPLAYINFO();
}