#include<iostream>
using namespace std;
int type(int *a,int n)
{
  int i,count1=0,count2=0;
  for(i=0;i<n;i++)
  {
    if(a[i]%2==0)
    {
      count1++;
    }
    else
    {
      count2++;
    }
  }
  if(count1==n)
  {
    return 1;
  }
  else if(count2==n)
  {
    return 0;
  }
  else
  {
    return -1;
  }
}
int main()
{
  int val,n,i,a[100];
  cin>>n;
  for(i=0;i<n;i++)
  {
    cin>>a[i];
  }
  val=type(a,n);
  cout<<"Enter the number of elements in the array"<<"\n";
  cout<<"Enter the elements in the array"<<"\n";
  if(val==1)
  {
    printf("The array is Even");
  }
  else if(val==0)
  {
    printf("The array is Odd");
  }
  else
  {
    printf("The array is Mixed");
  }

  
}