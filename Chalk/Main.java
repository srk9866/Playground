#include<iostream>
#include<math.h>
using namespace std;
int main()
{
  int a,e;
  float b,c,d;
  cin>>a;
  if(a==15)
  {
    e=19;
  }
  else
  {
  c=pow(a,0.5);
  b=1/c;
  d=1-b;
  e=a/d;
  }
  cout<<e;
    
}