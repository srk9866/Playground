#include<iostream>
#include<string.h>

int main()
{
    char a[100], b[100];    
      
    gets(a);    

     
    gets(b);
    
    if( strcmp(a,b) == 0 )
        printf("It is correct");
    else
        printf("It is wrong");
        return 0;
}
