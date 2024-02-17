// Write a C program to implement Matrix multiplication and validate the rules of multiplication.

#include<stdio.h>
#include<stdlib.h>
int main(void)
{
int m, n, p, q, i, j, k, mat1[10][10], mat2[10][10];
int prod[10][10] = {0};
printf("\n*********************************************************");
printf("\n*\PROGRAM TO IMPLEMENT MATRIX MULTIPLICATION\t*\n");
printf("*********************************************************");
printf("\nEnter the order of Matrix1\n");
scanf("%d%d",&m,&n);
printf("\nEnter the order of Matrix2\n");
scanf("%d%d",&p,&q);
if( n != p)
{
printf("\nMatrix Multplication not possible\n");
exit(0);
}
printf("\nEnter the elements of Matrix 1\n");
for(i=0;i<m;i++)
for(j=0;j<n;j++)
scanf("%d",&mat1[i][j]);
printf("\nEnter the elements of Matrix 2\n");
for(i=0;i<p;i++)
for(j=0;j<q;j++)
scanf("%d",&mat2[i][j]);
for(i=0;i<m;i++)
{
for(j=0;j<q;j++)
{
for(k=0;k<n;k++)
{
prod[i][j] += mat1[i][k] * mat2[k][j];
}
}
}
printf("\nMatrix 1\n");
for(i=0;i<m;i++)
{
for(j=0;j<n;j++)
{
printf("%d\t",mat1[i][j]);
}
printf("\n");
}
printf("\n");
printf("\nMatrix 2\n");
for(i=0;i<p;i++)
{
for(j=0;j<q;j++)
{
printf("%d\t",mat2[i][j]);
}
printf("\n");
}
printf("\n");
printf("\nThe Product matrix is is \n");
for(i=0;i<m;i++)
{
for(j=0;j<q;j++)
{
printf("%d\t",prod[i][j]);
}
printf("\n");
}
printf("\n");
return 0;
}
