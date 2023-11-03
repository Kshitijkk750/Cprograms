//WAP to find eligibility of a voter..

#include<iostream>
using namespace std;

int main(){
    int a;
    cout<<"Enter the age of Candidate :";
    cin>>a;
    try
    {
        if(a>=18)
        cout<<"Access granted- you are eligible..";
        else{
                throw"Access denied -Candidate is not eligible to vote ..";
        }
        
    }
   
    catch(const char* m)
    {
        cerr<<m;
    }
    
    
}