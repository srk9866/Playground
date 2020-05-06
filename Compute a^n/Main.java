#include <stdio.h>
int power(int n1, int n2);
int main() {
    int base, a, result;
    printf("Enter the value of a \n");
    scanf("%d", &base);
    printf("Enter the value of n \n");
    scanf("%d", &a);
    result = power(base, a);
    printf("The value of %d power %d is %d", base, a, result);
    return 0;
}

int power(int base, int a) {
    if (a != 0)
        return (base * power(base, a - 1));
    else
        return 1;
}