#include<iostream>
using namespace std;
int main()
{
  int a,b,c,i,min,hcf,x,l,m,n,k;
  cin>>a>>b>>c;
  min = (a < b ? a : b);
  min = (min < c ? min : c);
  for(i = min;i>0;i--)
  {
    if(a%i == 0 && b%i == 0 && c%i == 0)
    {
      hcf = i;
      break;
    }
  }
  cout<<"The treasure is in box which has number ";
  if(a>=b && a>=c)
  {
    if(b>c)
      cout<<b;
    else
      cout<<c;
  }
  else if(b>=a && b>=c)
  {
    if(a>c)
      cout<<a;
    else
      cout<<c;
  }
  else if(c>=a && c>=b)
  {
    if(a>b)
      cout<<a;
    else
      cout<<b;
  }
  cout<<"\nThe code to open the box is "<<hcf;
}