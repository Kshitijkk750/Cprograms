/*
Define class cashRegister in C++ with the following descriptions :
Private Members:
cashOnHand of type integer
Public Members:
A default constructor cashRegister() sets the cash in the register to 500.
A constructor cashRegister(int) sets the cash in the register to a specific amount.
A function getCurrentBalance() which returns value of cashOnHand
A function acceptAmount(int) to receive the amount deposited by the customer and
update the amount in the register
Define class dispenserType in C++ with the following descriptions :
Private Members:
numberOfItems of type integer
cost of type integer
Public Members:
A default constructor dispenserType () sets the cost and number of items in the
dispenser to 50 each.
A constructor dispenserType (int,int) sets the cost and number of items in the
dispenser to the values specified by the user.
A function getNoOfItems() to return the value of numberOfItems.
A function getCost() to return the value of cost.
A function makeSale() to reduce the number of items by 1.
*/

#include<iostream>
using namespace std;

class cashRegister{
    private:
    int cashOnHand;

    public:
    cashRegister(){
        cashOnHand=500;
    }

    cashRegister(int x){
        cashOnHand=x;
        cout<<cashOnHand;
    }

    int  getCurrentBalance(){
       return cashOnHand;
    }

    int  acceptAmount(int x){
        cashOnHand=cashOnHand+x;
        return cashOnHand;
    }
};

class dispenserType{
    private:
        int numberOfItems,cost;

    public:
        dispenserType (){
            cost=50;
            numberOfItems=50;
        }

        dispenserType (int x ,int y){
            numberOfItems=x;
            cost=y;
        }

        int getNoOfItems(){
            return numberOfItems;
        }

        int getCost(){
            return cost;
        }

       int  makeSale(){
        numberOfItems=numberOfItems-1;
        
       }

};

class sell:public dispenserType,public cashRegister
{
    private:int n,cost2,cash,am;
    public:void sellProduct()
    {
        cost2=getCost();
        cout<<"cost of candy is:"<<cost2;
        cout<<"\nEnter the Quantity\n";
        cin>>n;

        cout<<"\nEnter Amount for purchase:";
        cin>>am;
        cash=acceptAmount(am);
        cash=cash*n;
        
        if(cash>=50&&n<51)
        {
            for(int i=1;i<=n;i++)
            {
                makeSale();
            }
            cout<<"/nYour Purchase is successfully Done...!!\n";

        }else {
            cout<<"\nEnter valid purchase Amount\n";
        }
    }
};



int main(){

       
        cashRegister c;
        dispenserType d;
        sell s;
        cout<<"***CANDY MACHINE***\n\n";
        int a,v,am;
        cout<<"1.Candies\n"<<"2.Chips\n"<<"3.Gum\n"<<"4.Cookies\n\n";
        cout<<"Enter Your Choice:";
        cin>>a;

        switch(a)
        {
            case 1:system("clear");
            s.sellProduct();
            break;

            case 2:system("clear");
            s.sellProduct();
            break;

            case 3:system("clear");
            s.sellProduct();
            break;

            case 4:
            system("clear");
            s.sellProduct();
            break;

            default: cout<<"enter valis input";
            break;
        }

}