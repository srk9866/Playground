#include<iostream>
using namespace std;
int main()
{
  int a,b=0;
  cin>>a;
  cout<<a<<"\n";
  while(a>1)
  {
    if(a%2==0)
      a=a/2;
    else
      a=3*a+1;
    b=b+1;
    cout<<a<<"\n";
  }
  cout<<b;
  
  //Type your code here.
}