/*
Define a class in C++ with following description:
Private Members
A data member Flight number of type integer
A data member Destination of type string
A data member Distance of type float
A data member Fuel of type float
A member function CALFUEL() to calculate the value of Fuel as per the following
criteria
 Distance Fuel
 <=1000 500
 more than 1000 and <=2000 1100
 more than 2000 2200
Public Members
A function FEEDINFO() to allow user to enter values for Flight Number,
Destination, Distance & call function CALFUEL() to calculate the quantity of Fuel
A function SHOWINFO() to allow user to view the content of all the data members
*/

#include <iostream>
using namespace std;

class flight
{
private:
    int Flight_nu;
    string Destination;
    float Distance, fuel;

    int CALFUEL()
    {
        if (Distance <= 1000)
        {
            fuel = 500;
        }
        else if (Distance > 1000 && Distance <= 2000)
        {
            fuel = 1100;
        }
        else
        {
            fuel = 2200;
        }
        return fuel;
    }

public:
    void FEEDINFO()
    {
        cout << "Enter the flight number :\t";
        cin >> Flight_nu;
        cout << "\nEnter the Destination :\t\t";
        cin >> Destination;
        cout << "\nEnter the Distance :\t";
        cin >> Distance;
        cout << "\n";
        CALFUEL();
    }
    void SHOWINFO()
    {
        cout << "Flight number is   :\t" << Flight_nu;
        cout << "\nDestination is   :\t" << Destination;
        cout << "\nDistance is      :\t" << Distance;
        cout << "\nFuel required is :\t" << fuel << "\n";
    }
};
int main()
{
    system("clear");
    flight f;
    f.FEEDINFO();
    f.SHOWINFO();
}