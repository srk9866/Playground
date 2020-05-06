#include<iostream>
#include<cmath>
using namespace std;
int doc(int,int);
int main()
{
	int m,n,req;
    cin>>m>>n>>req;
  	int a=pow(m,n);
    doc(a,req);
  return 0;
}
int doc(int a,int req)
{
  if(a>=req)
    cout<<"Doctor, you can proceed with your experiment.";
  else
    cout<<"Sorry Doctor! You need more bacteria.";
}