#include<iostream>
using namespace std;
int main()
{
  int n,i,count=0;
  cin>>n;
  do{
    n=n/10;
    count=count+1;
  }while(i!=n);
  cout<<count;
  return 0;
  // Type your code here
}