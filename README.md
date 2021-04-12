#include<studio.h>
int main(){
int a=4,b=6;
printf("before swapping a=%d b=%d",a,b);
a=a++ + --b;
b=a-- + ++b;
printf("\nafter swapping a=%d b=%d",a,b);
  return 0;
}
