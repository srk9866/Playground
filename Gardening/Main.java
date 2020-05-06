#include<iostream>
using namespace std;
int main()
{
  int r,c,n;
  cin>>r>>c>>n;
  if(r*1<n && r*2>=n || r*(c-2)<n && r*(c-1)>=n)
     cout<<"It is a mango tree";
  else
     cout<<"It is not a mango tree";

}