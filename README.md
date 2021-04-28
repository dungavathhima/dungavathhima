#include<stdio.h>
#include<conio.h>
void main(){
int i,j,sum=0;
int *p;
int ar[3][3];
p=ar;
for(i=0;i<3;i++){
  for(j=0;j<3;j++){
scanf("%d",(p+i+j));
for(i=0;i<3;i++){
for(j=0;j<3;j++){
printf("%d",*p(*p+i)+j));
printf("\t");
}
printf("\n");
}
/*for sum of diagonal elements*/
for(i=0;i<3;i++){
for(j=0;j<3;j++){
if(i==j){
sum=sum+*(p+i+j);
}
}
printf("the sum is %d",sum);
getch();
}
