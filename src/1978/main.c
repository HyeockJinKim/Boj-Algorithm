#include <stdio.h>
#include <malloc.h>

int main() {
	int n, max = 0;

	scanf("%d", &n);
	int * s = malloc(sizeof(int)*n);

	for (int i = 0; i < n; ++i) {
		scanf("%d", s+i);
		max = max > *(s+i) ? max : *(s+i);
	}

	int * p = malloc(sizeof(int) * (max+1));
	*(p+1) = 0;
	*(p) = 0;
	for (int i = 2; i <= max; ++i)
		*(p+i) = 1;

	for (int i = 2; i <= max; ++i) {
		if (*(p+i))
			for (int j = i+i; j <= max; j += i) {
				*(p+j) = 0;
			}
	}

	int result = 0;
	for (int i = 0; i < n; ++i){
		if (*(p+*(s+i))) ++result;
	}
	printf("%d", result);
	free(s);
	free(p);
	return 0;
}