#include <stdio.h>

void main()
{
	int a, b;

	while(1)//무한 루프를 만드는 코드
	{
		printf("더할 두 수 입력 (멈추려면 Ctrl+C) : ");
		scanf("%d %d", &a, &b);//입력값을 공백으로 분리함
		printf("%d + %d = %d \n", a, b, a+b);//결과를 출력
	}
}
