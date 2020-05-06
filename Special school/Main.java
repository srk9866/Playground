#include<iostream>
#include<string.h>
using namespace std;
int main()
{
	char str[50],str1[50], temp;
	int i=0, j;
	gets(str);
    gets(str1);
	j=strlen(str)-1;
	while(i<j)
	{
		temp=str[i];
		str[i]=str[j];
		str[j]=temp;
		i++;
		j--;
	}
     if (strcmp(str, str1) == 0) 
    { 
        cout << "It is correct"; 
    } 
    else { 
        cout << "It is wrong"; 
    }
}