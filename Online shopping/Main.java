#include<iostream>
using namespace std;
int main()
{
  int a,b,c,d,e,f,g,h,i;
  float j,k,l;
  cin>>a>>b>>c>>d>>e>>f>>g>>h>>i;
  j=(a/100)*(100-b)+c;
  k=(d/100)*(100-e)+f;
  l=(g/100)*(100-h)+i;
  cout<<"In Flipkart Rs."<<j<<"\nIn Snapdeal Rs."<<k<<"\nIn Amazon Rs."<<l<<"\n";
  if(j<=k&&j<=l)
  {
    cout<<"He will prefer Flipkart";
  }
  else if(k<j&&k<=l)
  {
    cout<<"He will prefer Snapdeal";
  }
  else
  {
    cout<<"He will prefer Amazon";
  }
}