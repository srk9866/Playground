#include<iostream>
using namespace std;
int handshake(int n)  
{ 
    // when n becomes 0 that means all the  
    // persons have done handshake with other 
    if (n == 0)  
        return 0; 
    else
        return (n - 1) + handshake(n - 1);  
} 
  
int main() 
{ 
    int n;
    cin >> n;
    printf("%d", handshake(n)); 
    return 0; 
} 

