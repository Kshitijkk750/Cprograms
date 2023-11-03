//5.A program to copy content of one file to another file.
#include<iostream>
#include<fstream>
using namespace std;
//To copy content of one file to another file.
int main()
{
    system("clear");
ifstream fin;
fin.open("demo.txt");
ofstream fout;
fout.open("newf.txt");
char ch;
while(!fin.eof())
{
fin.get(ch);
fout<<ch;
}
cout<<"file is copied";
fin.close();
}