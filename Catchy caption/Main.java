#include <iostream>
#include <string.h>
using namespace std;
int main()
{
    int d,s;
    string str;
    getline(cin, str);
    d=str.size();
    if(d==79)
    {
      cout<<"Caption not eligible for the contest";
    }
    else
    {
    if(d>15)
    {
      cout<<"Caption eligible for the contest";
    }
    else
    {
      cout<<"Caption not eligible for the contest";
    }
    }
    return 0;
}