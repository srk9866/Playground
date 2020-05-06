#include <bits/stdc++.h> 
using namespace std; 
int main()
{
  int i,j,n;
  cin>>n;
  for(i=1;i<=n;i++)
  {
    for(j=1;j<=i;j++)
    {
      if(j<i)
      printf("%d*",i);
      else
      printf("%d",i);
    }
    printf(" \n");
  }
  for(i=n;i>=1;i--)
  {
    for(j=1;j<=i;j++)
    {
      if(j<i)
      printf("%d*",i);
      else
      printf("%d",i);
    }
    printf(" \n");
  }
  return 0;
}
