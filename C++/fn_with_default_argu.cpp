// Function with default argument.

#include<iostream>
using namespace std;
class demo
{
    int a, b, c;

public:
    void fun(int a, int b = 20, int c = 10);
};
void demo::fun(int a, int b, int c)
{
    int d = a + b + c;
    cout << "Addition = " << d<<"\n";
}
int main()
{
    demo d1;
    int a;
    //clrscr();
    cout << "Enter the value of a\n";
    cin >> a;
    d1.fun(a);
}