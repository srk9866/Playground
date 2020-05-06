#include<iostream>
using namespace std;
int main()
{
  int w,x,y,i,j,profit;
  cin>>w>>x>>y;
  i=w*x;
  j=w*y;
  profit=i-(j+100);
  cout<<profit;
  return 0;
}
