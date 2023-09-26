/*
5:->Define a class BOOK with the following specifications :
Private members of the class BOOK are
BOOK NO integer type
BOOKTITLE 20 characters
PRICE float (price per copy)
TOTAL_COST() A function to calculate the total cost for N number of copies
where N is passed to the function as argument.
Public members of the class BOOK are
INPUT() function to read BOOK_NO. BOOKTITLE, PRICE
PURCHASE() function to ask the user to input the number of copies to be
purchased. It invokes TOTAL_COST() and prints the total cost to
be paid by the user.
Note : You are also required to give detailed function definitions.
*/

#include <iostream>
using namespace std;

class BOOK
{
private:
    int BOOK_NO, nu;
    char BOOKTITLE[20];
    float price;
    void TOTAL_COST(int N)
    {

        float total_cost = price * N;
        cout << "Total Cost is :"<<total_cost << "\n";
    }

public:
    void INPUT()
    {
        cout << "Enter the book number :\t";
        cin >> BOOK_NO;
        cout << "\nEnter the BOOKTITLE :\t";
        cin >> BOOKTITLE;
        cout << "\nEnter the Price of Book :\t";
        cin >> price;
    }
    void PURCHASE()
    {

        cout << "Enter the number of copies :\t";
        cin >> nu;
        TOTAL_COST(nu);
    }
};
int main()
{
    system("clear");
    BOOK b;
    b.INPUT();
    b.PURCHASE();
}