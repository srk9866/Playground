#include<iostream>
using namespace std;

int main()
{
        int arr[10], i, num, n, cnt=0,pos;
        cin>>n;
        for(i=0; i<n; i++)
        {
           // cout<<" ";
            cin>>arr[i];
        }
        cin>>num;
        for(i=0; i<n; i++)
        {
       		if(arr[i]==num)
            {
                 cnt=1;
                 pos=i+1;
                 break;
            }
        }
        if(cnt==0)
        {
           cout<<"She failed\n";
        }
        else
        {
           cout<<"She passed her exam\n";
        }
        return 0;
}