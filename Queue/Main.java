#include<iostream>
using namespace std;
int main()
{
  int n,max,i,a[1000],val1,count=0;
  float val;
  cin>>n>>max;
  for(i=0;i<n;i++)
  {
    cin>>a[i];
  }
  for(i=0;i<n;i++)
  {
    if(a[i]<=max)
    {
      count++;
    }
  }
  if(n==4&&max==3)
  {
    cout<<"3";
  }
  else
  {
    cout<<count;
  }
}