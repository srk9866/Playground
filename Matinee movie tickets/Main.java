#include<iostream>
using namespace std;
int main()
{
 int a;
  float b;
  cin>>a>>b;
  if(a>13)
  {
    if(b>13.30)
    {
       cout<<"$5.00";
    }
    else
    {
      cout<<"$8.00";
    }
  }
  else
  {
    if(b>13.30)
    {
      cout<<"$2.00";
    }
    else
    {
      cout<<"$4.00";
    }
  }
}