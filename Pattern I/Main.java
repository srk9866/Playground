#include <iostream>
using namespace std;

int main()
{
  int n,i,j;
  cin>>n;
  for(i=0;i<4;i++)
  {
    for(j=0;j<=i;j++)
    {
      cout<<i+n;
    }
    cout<<endl;
  }
  
  for(i=3;i>=0;i--)
  {
    for(j=0;j<=i;j++)
    {
      cout<<i+n;
    }
    cout<<endl;
  }
  return 0;
}