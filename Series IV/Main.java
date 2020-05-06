#include<iostream>
#include<math.h>
using namespace std;
int main()
{
  int n,i;
  cin>>n;
  for(i=1;i<=n;i++)
  {
    if(i%2==0)
      cout<<(i*i)-2<<" ";
    else
      cout<<(i*i)-1<<" ";
  }
  return 0;
}