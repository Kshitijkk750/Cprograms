

#include<iostream>
using namespace std;
class Reactangle{
    int Length,Width;

    public:
       void setLength(float x)
       {
        Length=x;
       }
       void setWidth(float y)
       {
        Width=y;
       }
       float area()
       {
          float a;
          a=Length*Width;
          return a;
       }
       float perimeter()
       {
        float p;
        p=2*(Length*Width);
        return p;
       }
       void show()
       {
        cout<<"Length of Reactangle is: "<<Length<<endl;
        cout<<"Width of Reactangle is: "<<Width<<endl;
       }
       int sameArea(Reactangle &obj)
       {
             float ar=obj.Length*obj.Width;
             float ar1=area();
             if(ar1==ar)
             {
                 return 1;
             }
             return 0;

       }
};
       int main()
       {
           Reactangle r,r1;
           r.setLength(5);
           r.setWidth(4);
           float a=r.area();
           float p=r.perimeter();
           r.show();
           r1.setLength(6);
           r1.setWidth(4);
           r1.show();
           float a1=r1.area();
           int x=r1.sameArea(r);
           cout<<"Area of first Rectangle is :"<<r.area()<<"\n";
           cout<<"Area of second Rectangle is :"<<r1.area()<<"\n";
           if(x==1)
           {
            cout<<"Area of  both Rectangls are same \n";
           }
           else{
            cout<<"Area of both Rectangle are not same \n";
           }

       }
