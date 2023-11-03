#include<iostream>
using namespace std;
class demo{
    friend void msg();
};
void msg(){
    cout<<"hello mere dosto..!!\n";

}
int main(){
    system("clear");
    msg();
}
