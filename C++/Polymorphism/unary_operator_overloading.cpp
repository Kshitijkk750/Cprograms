//Unary operator overloading
#include<iostream>
using namespace std;
class op
{
int a,b;
public:
     op()
    {
     a=10;
     b=20;
    }

void operator ++()
{
a=++a;
b=b+3;
}
void show()
{
cout<<"value of a="<<a<<endl<<"value of b="<<b<<endl;
}
};
int main()
{
system("clear");
op o;
o.show();
++o;//calling
o.show();
}