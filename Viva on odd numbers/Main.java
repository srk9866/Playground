#include<iostream>
#include<iomanip>
using namespace std;
int main()
{
  int n;
  float o=0.0,e=0.0;
  while(1)
  {
    cin>>n;
    if(n<0)
    {
      cout<<o-e/2-1;
      return 0;
    }
    if(n%2)
      o++;
    else
      e++;
    if(o==3)
      break;
  }
  cout<<o-e/2;
}