#include<iostream>
using namespace std;
int main()
{
  int a,b,c;
  cin>>a>>b;
  c=b-a;
  if(c<0)
  {
    c=c+100;
  }
  cout<<c;
}