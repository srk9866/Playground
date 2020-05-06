#include<iostream>
using namespace std;
int main()
{
  int a,b,c,i;
  cin>>a>>b>>c;
  for(i=1;i<a*b;i++)
    {
      if(c==((b*i)+1))
      {
        cout<<"Yes";
        return 0;
      }
    }
  if(c>=1&&c<=b)
  {
    cout<<"Yes";
  }
  else if(c%b==0)
  {
    cout<<"Yes";
  }
  else
    cout<<"No";

}