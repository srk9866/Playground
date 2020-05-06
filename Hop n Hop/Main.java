#include<iostream>
using namespace std;
int main()
{
  int x1=3,y1=4,x2,y2,x,y,z;
  std::cin>>x2;
  std::cin>>y2;
  x = x2 - x1;
  y = y2 - y1;
  if(x>y)
  {
    std::cout<<x;
  }
  else
  {
    std::cout<<y;
  }
}