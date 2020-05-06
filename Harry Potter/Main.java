#include<iostream>
using namespace std;
int main()
{
  int in,op,ls,fd;
  cin>>in;
  if(in>1000)
  {
    ls=in%10;
    while(in>=10){
      in=in/10;
    }
    fd=in;
    op=fd+ls;
    cout<<op;
  }
  else
  {
    ls=in%10;
    
    fd=0;
    op=fd+ls;
    cout<<op;
  }
}