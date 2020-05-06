#include<iostream>
using namespace std;
int main()
{
  int x,y,z;
  cin>>x;
  cin>>y;
  cin>>z;
  cout<<"Enter first number : Enter second number : Menu\n";
  cout<<"1.Addition\n"<<"2.Subtraction\n"<<"3.Multiplication\n"<<"4.Division\n"<<"5.Remainder";
  
  switch(z)
  {
      case 1: cout<<"\n"<<x+y;
      break;
      case 2: cout<<"\n"<<x-y;
      break;
      case 3: cout<<"\n"<<x*y;
      break;
      case 4: cout<<"\n"<<x/y;
      break;
      case 5: cout<<"\n"<<x%y;
      break;
      default : cout<<"\nInvalid operation";
      break;
     
  }  
  return 0;
}
      