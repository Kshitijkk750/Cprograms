#include<iostream>
using namespace std;
#include<fstream>
int main()
{
    system("clear");
ofstream obj("Assignment.txt");
obj<<"Hello everyone we are in cdac."<<endl;
obj<<"cdac is located in nagpur."<<endl;
obj<<"the main branch of cdac is in pune ."<<endl<<"distance from nagpur to pune is 590 KM.";
obj<<"cdac fits in proper managemnet to prepare for the placemnets."<<endl;
cout<<"file is created \n\n";
ifstream fin;
int n;
char line[n];
    fin.open("Assignment.txt");
    cout << "data of the  file :->\n";
    while (!fin.eof())
    {
        fin.getline(line, n);
        cout << line << endl;
    }
    fin.close();
}