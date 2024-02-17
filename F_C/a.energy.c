#include<stdio.h>
#include<stdlib.h>
#include<math.h>
const double ACCL_GRAV = 9.806;
int main()
{
double dMass, dHeight, dVelocity;
double dPotEng, dKinEng, dEng;
printf("\n*************************************************************");
printf("\n*\tProgram to find Mechanical Energy of a body\t *\n");
printf("*************************************************************");
printf("\nEnter the mass (in kg) of the body: "); scanf("%lf", &dMass);
printf("\nEnter the height (in metres) of the body: "); scanf("%lf", &dHeight);
printf("\nEnter the velocity (in meters per second) of the body: "); scanf("%lf", &dVelocity);
dPotEng = dMass * ACCL_GRAV * dHeight;
dKinEng = dMass * dVelocity * dVelocity / 2;
dEng = dPotEng + dKinEng;
printf("\nPotential energy associated with the body is %0.3lf Joules\n", dPotEng);
printf("\nKinetic energy associated with the body is %0.3lf Joules\n", dKinEng);
printf("\nTotal energy associated with the body is %0.3lf Joules\n", dEng);
return 0;
}