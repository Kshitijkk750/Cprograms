//1.To write data into file using constructor.
#include<iostream>
using namespace std;
#include<fstream>
int main()
{
ofstream obj("demo.txt");
obj<<"Hello"<<endl<<23<<endl;
cout<<"file is created";
}
