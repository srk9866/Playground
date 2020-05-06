#include<iostream>
using namespace std;
int main()
{
  int n,i,a[1000],loc,val;
  cin>>n;
  for(i=0;i<n;i++)
  {
    cin>>a[i];
  }
  cin>>loc;
  cin>>val;
  for(i=n-1;i>=loc-1;i--)
  {
    a[i+1]=a[i];
  }
  a[loc-1]=val;
  cout<<"Enter the number of elements in the array"<<"\n";
  cout<<"Enter the elements in the array"<<"\n";
  cout<<"Enter the location where you wish to insert an element"<<"\n";
  if(loc>n)
  {
    cout<<"Invalid Input";
  }
  else
  {
    cout<<"Enter the value to insert"<<"\n";
    cout<<"Array after insertion is"<<"\n";
   for(i=0;i<=n;i++)
   {
     cout<<a[i]<<"\n";
   }
  }
}