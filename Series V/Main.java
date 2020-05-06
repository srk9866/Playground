#include<iostream>
using namespace std;
int main()
{
  int n,i;
  cin>>n;
  int k=11;
  while(n--)
  {
    cout<<k*k<<" ";
    k+=4;
  }
  return 0;
}
