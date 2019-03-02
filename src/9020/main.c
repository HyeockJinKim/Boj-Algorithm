#include <stdio.h>
#include <stdlib.h>

int main() {
	int prime[10001];

	for (int i = 0; i <= 10000; ++i) {
		*(prime+i) = 1;
	}

	for (int i = 2; i <= 10000; ++i) {
		if (*(prime+i)) {
			for (int j = i+i; j <= 10000; j += i) {
				*(prime+j) = 0;
			}
		}
	}
	int n;
	scanf("%d", &n);

	int * t = malloc(sizeof(int) * (n+1));
	for (int i = 1; i <= n; ++i)
		scanf("%d", t+i);

	for (int i = 1; i <= n; ++i) {
		int min=0;
		int limit = *(t+i)/2;
		for (int j = 0; j <= limit; ++j) {
			if (*(prime+j) && *(prime+*(t+i)-j) && min < j) {
				min = j;
			}
		}
		printf("%d %d\n", min, *(t+i)-min);
	}

	free(t);
	return 0;
}