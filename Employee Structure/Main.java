#include<iostream>
using namespace std;
struct employee{
char d[20],e[20];
 int a,b;
  float c;
}x;
int main()
{
  cout<<"Enter name:";
  cin>>x.d;
  cout<<"\nEnter ID:";
  cin>>x.a;
  cout<<"\nEnter age:";
  cin>>x.b;
  cout<<"\nEnter designation:";
  cin>>x.e;
  cout<<"\nEnter Salary:";
  cin>>x.c;
  cout<<"\nEmployee Details\n";
  cout<<"Name of the Employee : "<<x.d<<"\n";
  cout<<"ID of the Employee : "<<x.a<<"\n";
  cout<<"Age of the Employee : "<<x.b<<"\n";
  cout<<"Designation of the Employee : "<<x.e<<"\n";
  cout<<"Salary of the Employee : "<<x.c<<"";
}