#include<iostream>
using namespace std;
int main()
{
  int p,n,r;
  float amount,interest,total,discount;
  cin>>p;
  cin>>n>>r;
  interest=p*n*r/100;
  amount=p+interest;
  discount=0.02 * interest;
  total=amount-discount;
  cout<<interest<<"\n"<<amount<<"\n"<<discount<<"\n"<<total<<"\n";
  return 0;
}
