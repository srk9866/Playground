#include<iostream>
using namespace std;
int main()
{
  int n,v,i,a[100],sum=0;
  cin>>n>>v;
  for(i=0;i<n;i++)
  {
    cin>>a[i];
  }
  for(i=0;i<n;i++)
  {
    sum=sum+a[i];
  }
  if(sum<=v)
  {
    printf("YES");
  }
  else
  {
    printf("NO");
  }
}