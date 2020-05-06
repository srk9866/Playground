#include<iostream>
using namespace std;
int main()
{
  int a,b,c,d,e,f,g,h;
  cin>>a>>b>>c>>d>>e>>f>>g;
  a=a*150;
  if(b<=8)
    b=b*100;
  else
    b=(8*100)+((b-8)*115);;
  if(c<=8)
   c=c*100;
  else
    c=(8*100)+((c-8)*115);;
  if(d<=8)
 d=d*100;
  else
    d=(8*100)+((d-8)*115);;
  if(e<=8)
 e=e*100;
  else
    e=(8*100)+((e-8)*115);
  if(f<=8)
 f=f*100;
  else
    f=(8*100)+((f-8)*115);;
  g=g*125;
  h=a+b+c+d+e+f+g;
  cout<<h;
  


}