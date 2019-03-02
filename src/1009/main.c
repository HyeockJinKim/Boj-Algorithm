#include <stdio.h>
#include <stdlib.h>
#include <math.h>

int main() {
	int num, result;
	scanf("%d", &num);
	int * a = malloc(sizeof(int)*num);
	int * b = malloc(sizeof(int)*num);
	for (int i = 0; i < num; ++i) {
		scanf("%d%d", a+i, b+i);
		*(a+i) %= 10;
		*(b+i) = (*(b+i)-1) % 4 + 1;
	}

	for (int i = 0; i < num; ++i) {
		result = (int)(pow((double)*(a+i), (double) *(b+i)))% 10;
		if (result==0) {
			result = 10;
		}
		printf("%d\n", result);	
	}
	free(a);
	free(b);

	return 0;
}