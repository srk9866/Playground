#include<iostream>
using namespace std;
int main()
{
  int a,b,c,d;
  float e,f,g,h,i;
  cin>>a>>b>>c>>d;
  e=a/6;
  f=d/6;
  g=d%6;
  f=f+(g/10);
  h=c/f;
  i=b/e;
  cout<<e<<"\n"<<f<<"\n";
  printf("%.1f\n%.1f\n",h,i);
  if(h>i)
    cout<<"Eligible to Win";
  else
    cout<<"Not Eligible to Win";
}