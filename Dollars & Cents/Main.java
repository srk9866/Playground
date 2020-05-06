#include<iostream>
using namespace std;
int main()
{
  int a,b,c,d;
  cin>>a>>b>>c>>d;
  a=a+c;
  b=b+d;
  if(b>100)
  {
    b=b-100;
    a=a+1;
  }
  cout<<a<<"\n"<<b;

  //Type your code here.
}