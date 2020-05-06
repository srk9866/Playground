#include<iostream>
using namespace std;
int main()
{
  int n,i=1,sum=0,num1,num2;
    cin>>num1>>num2;
    n=num1+num2;
       while(i<n)
       {
       if(n%i==0)
       sum=sum+i;
       i++; 
       }
 
if(sum==n)
    cout <<"They can read the message"; 
else
    cout <<"They can't read the message";

return 0;
}