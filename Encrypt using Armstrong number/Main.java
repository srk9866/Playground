#include <iostream>
#include <math.h>
using namespace std;

int main()
{
   int num, temp, rem;
   int sum = 0, n = 0;

   
   cin >> num;

   temp = num;

   while (temp != 0)
   {
      temp = temp / 10;
      n++;
   }

   temp = num;

   while (temp != 0)
   {
      rem = temp % 10; 
      sum = sum + pow(rem, n); 
      temp = temp / 10;
   }

   if (num == sum)
      cout<< "Kindly proceed with encrypting" << endl;
   else
      cout<< "It is not an Armstrong number" << endl;

   return 0;
}