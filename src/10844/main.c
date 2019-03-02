#include <stdio.h>
#include <string.h>

int main() {
	long long step[10];
	long long next[10];
	for (int i = 0 ; i < 10; ++i) {
		*(step+i) = 1;
	}
	*(step) = 0;
	int result = 0;
	int n, size = sizeof(long long) * 10;
	scanf("%d", &n);
	for (int j = 1; j < n; ++j) {
		*(next) = *(step+1);
		for (int i = 1; i < 9; ++i) {
			*(next+i) = *(step+i-1) + *(step+i+1);
		}
		*(next+9) = *(step+8);
		for (int i = 0; i < 10; ++i)
			*(next+i) %= 1000000000;
		memcpy(step, next, size);
	}
	for (int i = 0; i < 10; ++i) {
		result += *(step+i);
		result %= 1000000000;
	}
	printf("%d", result);

	return 0;
}
