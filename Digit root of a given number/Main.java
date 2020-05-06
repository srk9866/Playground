#include<bits/stdc++.h>  
using namespace std; 
  
int digSum(int n) 
{ 
    if (n == 0)  
       return 0; 
    return (n % 9 == 0) ? 9 : (n % 9); 
} 
  
// Driver program to test the above function 
int main() 
{ 
    int n;
    cin>>n;
    cout<<digSum(n); 
    return 0; 
} 