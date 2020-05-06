#include<iostream>
using namespace std;
int main()
{

int n;
  float k,temp;
  cin>>n;
  k=0.5;
  cout<<k<<" ";
  while(--n)
  {
    temp=k*3;
    cout<<temp<<" ";
    k=temp;
  }
} 