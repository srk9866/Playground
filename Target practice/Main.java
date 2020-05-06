#include<iostream>
using namespace std;
int main()
{
  int n,target,sum=0,c=0;
    cin>>target;
    while(1)
    {
    cin>>n;
        sum+=n;
        c++;
        if(sum>=target)
            break;
    }
    printf("The number of turns is %d",c);
 return 0;

  //Type your code here.
}