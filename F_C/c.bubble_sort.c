// Write a C program to sort the given set of N numbers using Bubble sort.
#include<stdio.h>
#include<stdlib.h>
int main(void)
{
int iNum, i, j, iaArr[10], iTemp;
printf("\n*************************************************");
printf("\n*\tPROGRAM TO IMPLEMENT BUBBLE SORT\t*\n");
printf("*************************************************");
printf("\nEnter no of elements\n");
scanf("%d",&iNum);
printf("\nEnter the elements\n");
for(i=0;i<iNum;i++)
scanf("%d",&iaArr[i]);
for(i=0;i<iNum;i++)
{
for(j=0;j<iNum-i-1;j++)
{
if(iaArr[j] > iaArr[j+1])
{
iTemp = iaArr[j];
iaArr[j] = iaArr[j+1];
iaArr[j+1] = iTemp;
}
/*Code to show the program trace*/
/* printf("\nIteration i=%d, j=%d\n",i,j);*/
/* for(k=0;k<iNum;k++)*/
/* printf("%d\t",iaArr[k]);*/
}
}
printf("\nThe Sorted array is \n");
for(i=0;i<iNum;i++)
printf("%d\t",iaArr[i]);
printf("\n");
return 0;
}