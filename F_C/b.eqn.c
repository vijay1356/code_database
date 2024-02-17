// Write a C program to balance the given Chemical Equation values x, y, p, q of a simple chemical 
// equation of the type: The task is to find the values of constants b1, b2, b3 such that the equation is 
// balanced on both sides and it must be the reduced form.
// Generic Chemical Equation Form b1 ∗ Ax + b2 ∗ By ⇒ b3 (Ap Bq)

#include<stdio.h>
#include<stdlib.h>
int fnGCD(int, int );
int main(void)
{
int x, y, p, q;
int b1, b2, b3;
int iCommDivisor;
printf("Enter the atomocity(x) of Element1 : "); scanf("%d", &x);
printf("Enter the atomocity(y) of Element2 : "); scanf("%d", &y);
printf("Enter the atomocity(p) of Element1 in the compound : "); 
scanf("%d", &p);
printf("Enter the atomocity(q) of Element2 in the compound : "); 
scanf("%d", &q);
b1 = p * y;
b2 = q * x;
b3 = x * y;
//if b1, b2 and b3 together have a greatest common divisor divide each one by that greatest common divisor ;
iCommDivisor = fnGCD(b1,b2);
iCommDivisor = fnGCD(b3, iCommDivisor);
b1 = b1 / iCommDivisor;
b2 = b2 / iCommDivisor;
b3 = b3 / iCommDivisor;
printf("\nx = %d\ty = %d\tp = %d\tq = %d\n", x, y, p, q);
printf("\nb1 = %d\tb2 = %d\tb3 = %d\n", b1, b2,b3);
printf("\nBalanced Equation is now :\n\t%d*%d + %d*%d ==> %d(%d,%d)\n", 
b1,x,b2,y,b3,p,q);
return 0;
}
int fnGCD(int iVal1, int iVal2)
{
if (0 == iVal2)
return iVal1;
return fnGCD(iVal2, iVal1 % iVal2);
}