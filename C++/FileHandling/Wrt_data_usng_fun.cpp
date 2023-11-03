//2.To write data into file using open function.
//demo1.txt
#include<iostream>
#include<fstream>
using namespace std;
int main()
{
ofstream obj;
obj.open("demo1.txt");
obj<<"Welcome"<<endl<<"This is IT Networkz";
obj.close();
cout<<"file is created";
}