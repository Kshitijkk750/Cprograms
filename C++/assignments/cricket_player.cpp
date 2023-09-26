/*
Define a class batsman with the following specifications:
Private members:
bcode 4 digits code number
bname 20 characters
innings, notout, runs integer type
batavg it is calculated according to the formula –
 batavg =runs/(innings-notout)
calcavg() Function to compute batavg
Public members:
readdata() Function to accept value from bcode, name, innings, notout
and invoke the function calcavg()
displaydata() Function to display the data members on the screen.
*/

#include <iostream>
using namespace std;
class batsman
{
private:
    char bname[20];
    int innings, notout, runs, batavg, bcode;

    int calcavg()
    {
        batavg = runs / (innings - notout);
        return batavg;
    }

public:
    void readdata()
    {
        while (true)
        {
            cout << "Enter the bcode of Batsman :\t";
            cin >> bcode;

            if (bcode > 999 && bcode <= 9999)
            {
                break;
            }
            else
            {
                cout << "enter valid bcode..\n";
            }
        }
        cout << "\n Enter the name of Batsman :\t";
        cin >> bname;
        cout << "\n Innings played bt batsman :\t";
        cin >> innings;
        cout << "\n Total innings in which batsman is notout :\t";
        cin >> notout;
        cout << "\n Total runs batsman scored :\t";
        cin >> runs;
        calcavg();
    }
    void displaydata()
    {
        cout << "\n\n bcode of Batsman :\t" << bcode;
        cout << "\n name of Batsman :\t" << bname;
        cout << "\n Innings played bt batsman :\t" << innings;
        cout << "\n Total innings in which batsman is notout :\t" << notout;
        cout << "\n Total runs batsman scored :\t" << runs;
        cout << "\nAverage of the Batsman is :\t" << batavg << "\n";
    }
};

int main()
{
    system("clear");

    batsman b;
    b.readdata();
    b.displaydata();
}