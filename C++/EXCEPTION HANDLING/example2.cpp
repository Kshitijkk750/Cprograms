#include<iostream>
using namespace std;

int main(){
    int per;
    string name;
    string degree="engineering";
    string degre;
    int pcscore;
        cout<<"Enter the name of student :";
        cin>>name;
        cout<<"\n Enter the degree name : ";
        cin>>degre;
    try
    {
        if(degre==degree){
            cout<<"\nEnter the percentage :\n";
            cin>>per;
            try{
                if(per>=55){
                    cout<<"\nEnter the preCat ranking :\t";
                    cin>>pcscore;
                    try{
                        if(pcscore<=2000)
                        {
                            cout<<"Candidate is eligible for PGDAC course..\n";
                        }
                        else{
                            throw"Not eligible for PGDAC . Reappear for Precat exam.\n";
                        }
                    }
                    catch(const char* m)
                    {
                        cerr<<m;
                    }

                }
                else{
                    throw"Not eligible for PGDAC course, percent should greater than 55%\n";

                }
                
            }
            catch(const char* n){
                    cerr<<n;
                }

        }
        else {
            throw" Not eligible as degree must be an Engineering degree.\n";
        }
        }
    catch(const char* e)
    {
        cerr << e <<"\n";
    }
    
}