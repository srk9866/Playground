#include<iostream>
using namespace std;
int main()
{
  int n,j=6,sum=5,i;
  cin>>n;
  
  for(i=1;i<=n;i++)
  {
    printf("%d ",j);
    j=j+sum;
    sum=sum+5;
  }
}