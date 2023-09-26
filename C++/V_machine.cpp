#include<iostream>
using namespace std;
class cashRegister
{
    private: 
        int cashOnHand;

    public:
          cashRegister()
          {
            cashOnHand=0;
          }
          cashRegister(int x)
          {
            cashOnHand=x;
            cout<<cashOnHand;
          }

          int getCurrentBalance()
          {
            return cashOnHand;
          }

          int acceptAmount(int x)
          {
            cashOnHand+=x;
            cout<<"\nCashOnHand:\n"<<cashOnHand;
            return cashOnHand;
          }
};
class dispenserType
{
  private:
    int numberOfItems,cost;
        
  public:
        dispenserType()
        {
          numberOfItems=50;
          cost=50;
        }      
        dispenserType(int x,int y)
        {
          numberOfItems=x;
          cost=y;
        }
        
        int getNoOfItems()
        {
          return numberOfItems;
        } 

        int getCost()
        {
          return cost;
        }

        int makeSale()
        {
          numberOfItems-=1;
        }
};

class Sell:public dispenserType,public cashRegister
{
  private :
   int n,cost2,cash,am;
  public :
    void SellProduct()
         {
             cost2=getCost();
             cout<<"Cost of Candy is :" <<cost2; 
             cout<<"\nEnter The Quantity\n";
             cin>>n;
      
              cout<<"\nEnter Amount For Purchase: ";
             cin>>am;
             cash=acceptAmount(am);
             cash*=n;
             if(cash>=50&&n<51)
             {
             for(int i=1;i<=n;i++)
             {
              makeSale();
             }
             cout<<"\nYour Purchase is Sucessfully DOne...!!\n";
             }
             else{
              cout<<"\nEnter Valid Purchase Amount\n";
             }
         }
         
};
int main()
{
  cashRegister c;
  dispenserType d;
  Sell s;
  cout<<"**** Candy Machine ****\n\n";
  int a,v,am;
  cout<<"1.candies\n"<<"2.chips\n"<<"3.gum\n"<<"4.cookies\n\n";
  cout<<"Enter Your Choice: ";
  cin>>a;
  switch(a)
  {
    case 1:system("clear");
    
    s.SellProduct();

    break;

    case 2:system("clear");
    
     s.SellProduct();
    break;

    case 3:system("clear");

     s.SellProduct();
    break;

    case 4:system("clear");
    
     s.SellProduct();
    break;

    default:cout<<"Enter valid Input";
    break;       
  }
    
    
}