#include <stdio.h>

void main()
{
	int i;

	for(i = 1; i <= 100; i++)
	{
		printf("for문을 %d회 실했습니다. \n", i);
		break;
	}
	printf("for문을 종료했습니다. \n");
}
