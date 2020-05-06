#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int a,b,c,i;
  cin>>a;
  b=0;
  c=1;
  if(a%2==1)
  {
  for(i=0;i<a/2;i++)
  {
   b=b+c;
    c=b+c;
  }
  cout<<b;
  }
else
{
  for(i=0;i<a/2-1;i++)
  {
    b=b+c;
    c=b+c;
  }
  cout<<c;
}
}