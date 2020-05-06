#include<iostream>
using namespace std;

int main()
{
int i,j;
int n;
cin>>n;
for(i=1;i<=n;i++)
{
    for(j=1;j<=n;j++)
    {

        if(i%2==0)
        {
            if(j==1)
            {
                printf("%d",i+1);
            }
            else
                printf("%d",i);
        }
        else
        {
            if(j==n)
            {
                printf("%d",i+1);
                break;
            }
            else
            {
                printf("%d",i);
            }
        }
    }
    printf("\n");
}
return 0;
}