#include<stdio.h>
#include<stdlib.h>
 int gcd(int m,int n)
{
	int rem;
	while(n!=0)
	{
		rem=m%n;
		m=n;
		n=rem;
	}
	return(m);
}
int main()
{
	int num1,num2,num3,gcd1,gcd2,num4;
	scanf("%d",&num1);
	scanf("%d",&num2);
	scanf("%d%d",&num3,&num4);
 	if(num1==0 && num2==0 && num3==0)
	{
		printf("\nInvalid number");
		exit(0);
	}
 	gcd1=gcd(num1,num2);
	gcd2=gcd(num3,gcd1);
    if(gcd2==num4)
      printf("Answer is correct.");
  	else
      printf("Answer is wrong.");
 	return 0;
}