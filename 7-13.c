#include <stdio.h>

void main()
{

	int hap = 0;
	int a,b,c;

	printf("�հ��� ���۰� ==> ");
	scanf("%d",&a);
	printf("�հ��� ���� ==> ");
	scanf("%d",&b);
	printf("��� ==> ");
	scanf("%d", &c);

	for(int i= 1; i < b; i++){
		if(i%4==0){
			hap += i;
		}
	}
	printf("%d���� %d������ %d����� �հ� ==> %d \n",a,b,c,hap);
}


