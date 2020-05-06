#include<iostream>
#include<math.h>
using namespace std;
int main()
{
  int i,num,flag=0;
  cin>>num;
    for(int i=2 ; i < num/2 ; i++) {
      if(num%i == 0) {
         flag = 1;
         break;
      }
   }
  if(num==1)
  {
    cout<<"Not eligible";
  }
  else if(flag == 0) {
      cout<<"Eligible";
   }

  else
  {
    cout<<"Not eligible";
  }  
  return 0;
}