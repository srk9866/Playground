#include<iostream>
using namespace std;
int main()
{
 int a,b,c,d;
  std::cin>>a>>b>>c;
  d=(75*b)+(30*c);
  if(a>d)
    std::cout<<"Boat is stable";
  else
    std::cout<<"Boat will drow";
}